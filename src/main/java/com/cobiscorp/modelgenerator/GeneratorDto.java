package com.cobiscorp.modelgenerator;

import com.cobiscorp.modelgenerator.model.MessField;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.MessageFormat;
import java.util.List;
import java.util.Map;

public class GeneratorDto {
    public static String newLine = "\n";
    public static String packageDefinition = "com.cobiscorp.accl.messagetransformation.bsl.dto;";
    public static String imports = "import java.io.Serializable;\nimport javax.validation.constraints.*;";
    public static String classDefinition = "public class {0} implements Serializable";
    public static String notBlank = "@NotBlank(message = \"{0} cannot be blank\")";
    public static String notNull = "@NotNull(message = \"{0} cannot be null\")";
    public static String size = "@Size(max = {0}, min = {1})";
    public static String property = "private String {0};";
    public static String serialVersion = "private static final long serialVersionUID = -3027297081943227365L;";
    public static String classEnd = "}";

    private String network;
    private String message;
    private Map<String, List<MessField>> map;
    private String className;
    private StringBuilder stringBuilder;

    public GeneratorDto(String network, String message, Map<String, List<MessField>> map) {
        this.network = network;
        this.message = message;
        this.map = map;
    }

    public String getClassName() {
        return className;
    }

    public StringBuilder getStringBuilder() {
        return stringBuilder;
    }

    public GeneratorDto invoke() throws IOException {


        className = "{0}ReceiverOrder{1}.java";
        className = MessageFormat.format(className, network, message);
        Files.deleteIfExists(Paths.get("./" + className));
        Files.createFile(Paths.get("./" + className));
        stringBuilder = new StringBuilder("");
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
            prop =  (prop);

            stringBuilder.append(MessageFormat.format(notBlank, e.getKey()));
            stringBuilder.append(MessageFormat.format(property, prop));
            stringBuilder.append(newLine);
            stringBuilder.append(newLine);
        }

        stringBuilder.append(newLine);
        stringBuilder.append(classEnd);
        return this;
    }
}