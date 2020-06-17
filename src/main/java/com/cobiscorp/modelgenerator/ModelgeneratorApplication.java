package com.cobiscorp.modelgenerator;

import com.cobiscorp.modelgenerator.model.MessField;
import com.github.mustachejava.DefaultMustacheFactory;
import com.github.mustachejava.Mustache;
import com.github.mustachejava.MustacheFactory;
import org.apache.juli.logging.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@SpringBootApplication
public class ModelgeneratorApplication implements CommandLineRunner {
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
        generateClasses(messFieldList, "ACCL-MLD", "1A");

        ((ConfigurableApplicationContext) context).close();
    }


    public void generateClasses(List<MessField> messFieldList,
                                String network,
                                String message) throws IOException {


        String newLine = "\n";
        String packageDefinition = "package com.cobiscorp.accl.messagetransformation.bsl.dto;";
        String imports = "import java.io.Serializable;\nimport javax.validation.constraints.*;";
        String classDefinition = "public class {0} implements Serializable";

        String notBlank = "@NotBlank(message = \"{0} cannot be null\")";
        String size = "@Size(max = {0}, min = {1})";
        String property = "private String {0};";
        String serialVersion = "private static final long serialVersionUID = -3027297081943227365L;";

        String classEnd = "}";

        Map<String, List<MessField>> map = messFieldList
                .stream()
                .distinct()
                .filter(s -> network.equals(s.getVi_network()))
                .filter(s -> message.equals(s.getVi_mess_name()))
                .collect(Collectors.groupingBy(MessField::getVi_variablename));

        LOG.info(map.toString());

        String className = "{0}ReceiverOrder{1}.java";
        className = MessageFormat.format(className, network, message);
        Files.deleteIfExists(Paths.get("./" + className));
        Files.createFile(Paths.get("./" + className));
        StringBuilder stringBuilder = new StringBuilder("");
        stringBuilder.append(packageDefinition);
        stringBuilder.append(newLine);
        stringBuilder.append(newLine);
        stringBuilder.append(imports);
        stringBuilder.append(newLine);
        stringBuilder.append(newLine);
        stringBuilder.append(MessageFormat.format(classDefinition, className) + "{");
        stringBuilder.append(newLine);
        stringBuilder.append(serialVersion);
        stringBuilder.append(newLine);
        for (Map.Entry e : map.entrySet()) {
            String prop = (String) e.getKey();
            prop =  camelCase(prop);

            stringBuilder.append(MessageFormat.format(notBlank, e.getKey()));
            stringBuilder.append(MessageFormat.format(property, prop));
            stringBuilder.append(newLine);
            stringBuilder.append(newLine);
        }

        stringBuilder.append(newLine);
        stringBuilder.append(classEnd);

        generateFile(className,stringBuilder.toString());

    }

    public void generateFile(String className, String content) throws IOException {
        Files.write(Paths.get(className), content.getBytes(), StandardOpenOption.CREATE);
    }

    private static String camelCase(String word) {
        String[] chars = word.split("");
        Boolean upper = false;
        String results = "";
        for (String c : chars) {
            if (!"_".equals(c)) {
                results += upper ? c.toUpperCase() : c;
                upper = false;
            } else {
                upper = true;
            }
        }
        return results;
    }
}