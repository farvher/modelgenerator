package com.cobiscorp.modelgenerator;

import com.cobiscorp.modelgenerator.model.ContextEquivalence;
import com.cobiscorp.modelgenerator.model.ContextTransform;
import com.cobiscorp.modelgenerator.model.MessField;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GenerateTransforms {

    private final static String TRANSFORM_MUSTACHE = "transform.mustache";


    private static Logger LOG = LoggerFactory
            .getLogger(GenerateTransforms.class);

    public static String[] acclToCanonical = {"2A", "3B", "1B", "4A", "5A"};
    public static String[] canonicalToAccl = {"1A", "3A", "AR"};


    public static void generateTransforms(List<MessField> messFieldList) {

        Map<String, Map<String, List<MessField>>> types = messFieldList
                .stream()
                .collect(Collectors.groupingBy(MessField::getVi_network
                        , Collectors.groupingBy(MessField::getVi_mess_name)));

        LOG.info(types.toString());
        types.forEach((s, t) -> {
            t.forEach((u, v) -> {
                generateEquivalents(s, u, v);
                buildTransformation(s, u, v);
            });
        });

    }

    public static void buildTransformation(String network, String message, List<MessField> messFieldList) {
        if (Arrays.asList(acclToCanonical).contains(message)) {
            ContextTransform contextTransform = new ContextTransform();
            String ttype = "CanonicalReceiveOrder";
            String stype = MessageFormat.format("{0}{1}"
                    , network.replace("-", "")
                    , message);
            String className = MessageFormat.format("Transform{0}to{1}", stype, ttype);
            contextTransform.setClassName(className);
            contextTransform.setTtype(ttype);
            contextTransform.setStype(stype);
            List<ContextTransform.Builder> builders = new ArrayList<>();
            messFieldList.stream()
                    .collect(Collectors.groupingBy(MessField::getVi_desc_business_var))
                    .forEach((s, m) -> {
                        MessField tmp = m.stream().findAny().get();
                        String getter = tmp.getVi_variablename();
                        getter = Util.camelCase(StringUtils.capitalize(getter));
                        String setter = s;
                        String valueType = tmp.getVi_valuetype();
                        String methodName = Util.camelCase(tmp.getVi_variablename());

                        ContextTransform.Builder builder = new ContextTransform.Builder(getter, setter, valueType,stype,methodName);
                        builders.add(builder);
                    });
            contextTransform.setBuilders(builders);
            String content = Util.mustacheContent(contextTransform, TRANSFORM_MUSTACHE);
            Util.generateFile(MessageFormat.format("./classes/{0}.java", className), content);


        } else if (Arrays.asList(canonicalToAccl).contains(message)) {
            ContextTransform contextTransform = new ContextTransform();
            String stype = "CanonicalReceiveOrder";
            String ttype = MessageFormat.format("{0}{1}"
                    , network.replace("-", "")
                    , message);
            String className = MessageFormat.format("Transform{1}to{0}", stype, ttype);
            contextTransform.setClassName(className);
            contextTransform.setTtype(ttype);
            contextTransform.setStype(stype);
            List<ContextTransform.Builder> builders = new ArrayList<>();
            messFieldList.stream()
                    .collect(Collectors.groupingBy(MessField::getVi_desc_business_var))
                    .forEach((s, m) -> {
                        MessField tmp = m.stream().findAny().get();
                        String getter = tmp.getVi_variablename();
                        getter = "with" + StringUtils.capitalize(Util.camelCase(getter));
                        String setter = StringUtils.capitalize(s);
                        String valueType = tmp.getVi_valuetype();
                        String methodName = Util.camelCase(tmp.getVi_desc_business_var());

                        ContextTransform.Builder builder = new ContextTransform.Builder(setter, getter, valueType,ttype,methodName);
                        builders.add(builder);
                    });
            contextTransform.setBuilders(builders);
            String content = Util.mustacheContent(contextTransform, TRANSFORM_MUSTACHE);
            Util.generateFile(MessageFormat.format("./classes/{0}.java", className), content);


        }


    }

    public static List<String> generateCatalogsConstants(List<MessField> messFieldsList) {

        String constantFormat = "private String {0} = \"{1}\";";
        return messFieldsList.stream()
                .collect(Collectors.groupingBy(MessField::getVi_equivalentvalue))
                .keySet()
                .stream()
                .distinct()
                .map(s -> MessageFormat.format(constantFormat, s.toUpperCase().replace(" ", "_"), s))
                .collect(Collectors.toList());

    }

    public static void generateEquivalents(String network, String message, List<MessField> messFields) {

        Boolean directionAcclToCanonnical = Arrays.asList(acclToCanonical).contains(message);
        List<ContextEquivalence.Method> methods = new ArrayList<>();

        messFields.stream()
                .filter(m -> "C".equals(m.getVi_valuetype()))
                .collect(Collectors.groupingBy(directionAcclToCanonnical ? MessField::getVi_variablename : MessField::getVi_desc_business_var,
                        Collectors.groupingBy(directionAcclToCanonnical ? MessField::getVi_equivalentvalue : MessField::getVi_cobiscatalogid)))
                .forEach((e, m) -> {
                    e.isEmpty(); //Nombre de variable o variable de negocio
                    ContextEquivalence.Method method = new ContextEquivalence.Method();

                    method.setReturnType("String");
                    method.setParamType("String");
                    method.setMethodName(Util.camelCase(e));
                    method.setParam(false ? " == o" : ".equals(o)");

                    List<ContextEquivalence.Conditions> conditions = new ArrayList<>();
                    m.forEach((f, n) -> {
                        f.isEmpty(); //Nombre de catalogo o equivalencia

                        n.forEach(p -> {
                            MessField tmp = n.stream().findFirst().get();
                            String o = !directionAcclToCanonnical ? tmp.getVi_equivalentvalue() : tmp.getVi_cobiscatalogid();
                            ContextEquivalence.Conditions condition = new ContextEquivalence.Conditions(f, o);
                            conditions.add(condition);
                        });
                        method.setConditions(conditions.stream().distinct().collect(Collectors.toList()));
                    });
                    methods.add(method);
                });
        String className = "Eq" + network.replace("-", "") + message;
        ContextEquivalence equivalence = new ContextEquivalence();
        equivalence.setClassName(className);
        equivalence.setMethods(methods);
        equivalence.setFrom(directionAcclToCanonnical ? "ACCL" : "CANONICAL");
        equivalence.setTo(directionAcclToCanonnical ? "CANONICAL" : "ACCL");
        equivalence.setRequest(directionAcclToCanonnical ? "equivalentValue" : "catalogId");
        equivalence.setResponse(directionAcclToCanonnical ? "catalogId" : "equivalentValue");

        String content = Util.mustacheContent(equivalence, "equivalent.mustache");

        if (!methods.isEmpty()) {
            Util.generateFile(MessageFormat.format("./classes/{0}.java", className), content);

        }


    }

}
