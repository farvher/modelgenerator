package com.cobiscorp.modelgenerator;

import com.cobiscorp.modelgenerator.model.Context;
import com.cobiscorp.modelgenerator.model.ContextTest;
import com.cobiscorp.modelgenerator.model.MessField;
import com.github.mustachejava.DefaultMustacheFactory;
import com.github.mustachejava.Mustache;
import com.github.mustachejava.MustacheFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.util.StringUtils;

import java.io.IOException;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.MessageFormat;
import java.util.*;
import java.util.stream.Collectors;

@SpringBootApplication
public class ModelgeneratorApplication implements CommandLineRunner {
    public static final String DTOTEMPLATE_MUSTACHE = "dtotemplate.mustache";
    public static final String TESTTEMPLATE_MUSTACHE = "testtemplate.mustache";
    public static final String MNEMONICTEMPLATE_MUSTACHE = "mnemonic.mustache";
    public static final String TEST_CLASSNAME = "TransformAcclToCanonicalReceiveOrderTest";
    public static final String TEST_CLASSNAME2 = "CanonicalReceiveOrderToTransformAcclTest";

    public static String[] acclToCanonical = {"2A", "3B", "1B", "4A", "5A"};
    public static String[] canonicalToAccl = {"1A", "3A", "AR"};

    @Autowired
    private ApplicationContext context;

    private static Logger LOG = LoggerFactory
            .getLogger(ModelgeneratorApplication.class);

    public static void main(String[] args) {
        LOG.info("STARTING THE APPLICATION");
        SpringApplication.run(ModelgeneratorApplication.class, args);
        LOG.info("APPLICATION FINISHED");
    }

    @Override
    public void run(String... args) throws IOException {
        LOG.info("EXECUTING : command line runner");

        Path data = Paths.get("./data1.txt");
        List<String> content = Files.readAllLines(data);

        List<MessField> messFieldList = new ArrayList<>();

        for (String line : content) {
            String[] split = line.split(";");
            MessField temp = new MessField();
            temp.setVi_key(split[0]);
            temp.setVi_id(split[1]);
            temp.setVi_variablename(split[2]);
            temp.setVi_business_variable(split[3]);
            temp.setVi_desc_business_var(split[4]);
            temp.setVi_description(split[5]);
            temp.setVi_valuetype(split[6]);
            temp.setVi_length(split[7]);
            temp.setVi_datasource(split[8]);
            temp.setVi_codigo(split[9]);
            temp.setVi_fieldtype(split[10]);
            temp.setVi_messageid(split[11]);
            temp.setVi_validateexistence(split[12]);
            temp.setVi_fieldid(split[13]);
            temp.setVi_validatecontent(split[14]);
            temp.setVi_digitalsignature(split[15]);
            temp.setVi_tableid(split[16]);
            temp.setVi_cobiscatalogid(split[17]);
            temp.setVi_equivalentvalue(split[18]);
            temp.setVi_mess_name(split[19]);
            temp.setVi_network(split[20]);
            temp.setVi_datatype(split[21]);
            messFieldList.add(temp);
        }


        //generateMnemonic(messFieldList);
        generateDtoAndTests(messFieldList);
        //GenerateTransforms.generateTransforms(messFieldList);

        ((ConfigurableApplicationContext) context).close();
    }

    public void generateMnemonic(List<MessField> messFieldList) {
        List<String> constants = GenerateTransforms.generateCatalogsConstants(messFieldList);
        Context context = new Context();
        context.setClassname("Mnemonic");
        context.setConstants(constants);
        String content = Util.mustacheContent(context, MNEMONICTEMPLATE_MUSTACHE);
        Util.generateFile(MessageFormat.format("./classes/{0}.java", "Mnemonic"), content);
    }

    private void generateDtoAndTests(List<MessField> messFieldList) {
        Map<String,
                Map<String, List<MessField>>> types = messFieldList
                .stream()
                .collect(Collectors.groupingBy(MessField::getVi_network
                        , Collectors.groupingBy(MessField::getVi_mess_name)));

        List<ContextTest.Test> tests = new ArrayList<>();
        List<ContextTest.Test> tests2 = new ArrayList<>();

        types.entrySet().stream().forEach(t -> t.getValue().forEach((m, n) -> {
            String network = t.getKey();
            String messageType = m;
            //TODO definir nombre del dto
            String name = MessageFormat.format("{0}{1}"
                    , network.replace("-", "")
                    , messageType);
            LOG.info(name + " GENERATING...");
            generateClasses(name, messFieldList, network, messageType);
            if(Arrays.asList(acclToCanonical).contains(messageType)) {
                tests.add(generateTestCases(name, messFieldList, network, messageType, Arrays.asList(acclToCanonical).contains(messageType)));
            }else{
                tests2.add(generateTestCases(name, messFieldList, network, messageType, Arrays.asList(acclToCanonical).contains(messageType)));
            }

        }));

        ContextTest contextTest = new ContextTest(tests, TEST_CLASSNAME);
        ContextTest contextTest2 = new ContextTest(tests2, TEST_CLASSNAME2);
        String content = Util.mustacheContent(contextTest, TESTTEMPLATE_MUSTACHE);
        String content2 = Util.mustacheContent(contextTest2, TESTTEMPLATE_MUSTACHE);
        Util.generateFile(MessageFormat.format("./classes/{0}.java", TEST_CLASSNAME), content);
        Util.generateFile(MessageFormat.format("./classes/{0}.java", TEST_CLASSNAME2), content2);


    }


    public void generateClasses(String className,
                                List<MessField> messFieldList,
                                String network,
                                String message) {


        Map<String, List<MessField>> fields = messFieldList
                .stream()
                .distinct()
                .filter(s -> network.equals(s.getVi_network()))
                .filter(s -> message.equals(s.getVi_mess_name()))
                .collect(Collectors.groupingBy(MessField::getVi_variablename));

        fields.keySet().forEach(LOG::info);

        Context context = new Context();
        context.setClassname(className);
        context.setPackages(GeneratorDto.packageDefinition);
        context.setSerialVersionUID("312312412312312312L");
        List<Context.Property> properties = fields.entrySet()
                .stream()
                .map(f -> new Context.Property(Util.camelCase(f.getKey()),
                        buildAnnotations(f.getValue())))
                .collect(Collectors.toList());

        context.setProperties(properties);
        String content = Util.mustacheContent(context, DTOTEMPLATE_MUSTACHE);
        Util.generateFile(MessageFormat.format("./classes/{0}.java", className), content);

    }

    public void generateCanonical(String className,
                                  List<MessField> messFieldList,
                                  String network,
                                  String message) {


        Map<String, List<MessField>> fields = messFieldList
                .stream()
                .distinct()
                .filter(s -> network.equals(s.getVi_network()))
                .filter(s -> message.equals(s.getVi_mess_name()))
                .collect(Collectors.groupingBy(MessField::getVi_variablename));

        fields.keySet().forEach(LOG::info);

        Context context = new Context();
        context.setClassname(className);
        context.setPackages(GeneratorDto.packageDefinition);
        context.setSerialVersionUID("312312412312312312L");
        List<Context.Property> properties = fields.entrySet()
                .stream()
                .map(f -> new Context.Property(Util.camelCase(f.getKey()),
                        buildAnnotations(f.getValue())))
                .collect(Collectors.toList());

        context.setProperties(properties);
        String content = Util.mustacheContent(context, MNEMONICTEMPLATE_MUSTACHE);
        Util.generateFile(MessageFormat.format("./classes/{0}.java", className), content);

    }


    public List<String> buildAnnotations(List<MessField> messFields) {

        Optional<MessField> first = messFields.stream()
                .findFirst();


        String notBlank = first
                .filter(f -> "S".equals(f.getVi_validatecontent()))
                .map(s -> MessageFormat
                        .format(GeneratorDto.notBlank, s.getVi_variablename()))
                .orElse("");

        String notNull = first
                .filter(f -> "S".equals(f.getVi_validateexistence()))
                .map(s -> MessageFormat
                        .format(GeneratorDto.notNull, s.getVi_variablename()))
                .orElse("");

        String size = first
                .map(s -> MessageFormat
                        .format(GeneratorDto.size, s.getVi_length(), "1"))
                .orElse("");

        List<String> result = Arrays.asList(notNull, notBlank, size)
                .stream()
                .filter(s -> !s.isEmpty()).collect(Collectors.toList());

        return result;
    }


    public ContextTest.Test generateTestCases(String className,
                                              List<MessField> messFieldList,
                                              String network,
                                              String message,
                                              Boolean AC_CAN) {


        Map<String, List<MessField>> fields = messFieldList
                .stream()
                .distinct()
                .filter(s -> network.equals(s.getVi_network()))
                .filter(s -> message.equals(s.getVi_mess_name()))
                .collect(Collectors.groupingBy(AC_CAN ?
                        MessField::getVi_variablename : MessField::getVi_desc_business_var));

        fields.keySet().forEach(LOG::info);

        List<String> properties = fields.entrySet().stream().map(
                s -> {
                    MessField mf = s.getValue().stream().findAny().get();
                    String equivalent = AC_CAN ? mf.getVi_equivalentvalue() : mf.getVi_cobiscatalogid();
                    int length = Integer.parseInt(mf.getVi_length());
                    String fakeValue = Util.getFakeValue(length);
                    equivalent = equivalent.isBlank() ? fakeValue : equivalent;
                    String format = AC_CAN ? ".with{0}(\"{1}\")":".{0}(\"{1}\")";
                    String method = AC_CAN ?
                            StringUtils.capitalize(Util.camelCase(s.getKey())) :Util.camelCase(s.getKey())  ;
                    if("amount".equals(s.getKey())){
                        equivalent = "new java.math.BigDecimal(100L)";
                        format = ".{0}({1})";
                    }
                    String prop = MessageFormat.format(format, method, equivalent);
                    return prop;
                }
        ).collect(Collectors.toList());


        String assertFormat = "assertEquals(transformation.get{1}, {2});";
        List<String> asserts = new ArrayList<>();
        fields.entrySet().stream().forEach( s-> {
            MessField mf = s.getValue().stream().findFirst().get();
            if("C".equals(mf.getVi_valuetype())){
                String equivalentValue = AC_CAN ?  mf.getVi_cobiscatalogid() : mf.getVi_equivalentvalue();
                String getter = AC_CAN ? mf.getVi_desc_business_var(): mf.getVi_variablename();
                getter = StringUtils.capitalize(Util.camelCase(getter))+"()";
                String assertMessage = getter + " value must be " + equivalentValue;
                asserts.add(MessageFormat.format(assertFormat,assertMessage,getter,"\"" +equivalentValue + "\""));
            }else if("V".equals(mf.getVi_valuetype())){
                String equivalentValue = AC_CAN ? mf.getVi_variablename(): mf.getVi_desc_business_var();
                equivalentValue = "tmpDto.get" + StringUtils.capitalize(Util.camelCase(equivalentValue)) + "()";
                String getter = AC_CAN ? mf.getVi_desc_business_var(): mf.getVi_variablename();;
                getter = StringUtils.capitalize(Util.camelCase(getter))+"()";
                String assertMessage = getter + " value must be " + equivalentValue;
                asserts.add(MessageFormat.format(assertFormat,assertMessage,getter,equivalentValue));
            }

            //assertEquals("",transformation.getOriginatorNumberOrder(), "");
            //assertEquals("",transformation.getNumOrdenOriginante(),);

        });

        ContextTest.Test test = new ContextTest.Test();

        String testName = className + "Test()";
        test.setTextName(testName);
        test.setDtoName(AC_CAN ? className : "CanonicalReceiveOrder");
        test.setProperties(properties);
        test.setAsserts(asserts);
        String stype = AC_CAN ? className : "CanonicalReceiveOrder";
        String ttype = AC_CAN ? "CanonicalReceiveOrder" : className;
        String format = "{1} transformation = new Transform{0}to{1}(tmpDto).transform()";
        String transformation = MessageFormat.format(format, stype, ttype);
        test.setTransformation(transformation);
        return test;

    }


}