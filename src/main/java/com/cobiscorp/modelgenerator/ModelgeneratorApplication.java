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
        //generateDtoAndTests(messFieldList);
        GenerateTransforms.generateTransforms(messFieldList);

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
        types.entrySet().stream().forEach(t -> t.getValue().forEach((m, n) -> {
            String network = t.getKey();
            String messageType = m;
            //TODO definir nombre del dto
            String name = MessageFormat.format("{0}{1}"
                    , network.replace("-", "")
                    , messageType);
            LOG.info(name + " GENERATING...");
            generateClasses(name, messFieldList, network, messageType);
            tests.add(generateTestCases(name, messFieldList, network, messageType));

        }));

        ContextTest contextTest = new ContextTest(tests, TEST_CLASSNAME);
        String content = Util.mustacheContent(contextTest, TESTTEMPLATE_MUSTACHE);
        Util.generateFile(MessageFormat.format("./classes/{0}.java", TEST_CLASSNAME), content);

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
                                              String message) {

        Map<String, List<MessField>> fields = messFieldList
                .stream()
                .distinct()
                .filter(s -> network.equals(s.getVi_network()))
                .filter(s -> message.equals(s.getVi_mess_name()))
                .collect(Collectors.groupingBy(MessField::getVi_variablename));

        fields.keySet().forEach(LOG::info);

        List<String> properties = fields.entrySet().stream().map(
                s -> {
                    MessField mf = s.getValue().stream().findAny().get();
                    String equivalent = mf.getVi_equivalentvalue();
                    int length = Integer.parseInt(mf.getVi_length());
                    String fakeValue = Util.getFakeValue(length);
                    equivalent = equivalent.isBlank() ? fakeValue : equivalent;
                    String prop = MessageFormat.format(".with{0}(\"{1}\")", StringUtils.capitalize(Util.camelCase(s.getKey())), equivalent);
                    return prop;
                }
        ).collect(Collectors.toList());

        ContextTest.Test test = new ContextTest.Test();

        String testName = className + "Test()";
        test.setTextName(testName);
        test.setDtoName(className);
        test.setProperties(properties);
        return test;

    }


}