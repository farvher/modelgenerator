package com.cobiscorp.modelgenerator;

import com.github.mustachejava.DefaultMustacheFactory;
import com.github.mustachejava.Mustache;
import com.github.mustachejava.MustacheFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Util {


    private static Logger LOG = LoggerFactory
            .getLogger(Util.class);

    public static String getFakeValue(int length) {
        String fakeValue = "";
        for (int i = 1; i < length; i++) {
            fakeValue += i;
            if (i > 10) {
                break;
            }
        }
        return fakeValue;
    }

    public static String camelCase(String word) {
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

    public static void generateFile(String className, String content) {
        LOG.info("GENERATING "+ className);
        try {
            Files.deleteIfExists(Paths.get(className));
            Files.write(Paths.get(className), content.getBytes(), StandardOpenOption.CREATE_NEW);
        } catch (IOException e) {
            LOG.error("Error generating file", e);
        }

    }


    public static String mustacheContent(Object context, String template) {
        try {
            StringWriter writer = new StringWriter();
            MustacheFactory mf = new DefaultMustacheFactory();
            Mustache mustache = mf.compile(template);
            mustache.execute(writer, context).flush();
            return writer.toString();
        } catch (Exception ex) {
            LOG.error("mustache error", ex);
        }
        return "";
    }
}
