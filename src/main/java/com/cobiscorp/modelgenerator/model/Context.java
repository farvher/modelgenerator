package com.cobiscorp.modelgenerator.model;

import org.springframework.util.StringUtils;

import java.util.List;
import java.util.stream.Collectors;

public class Context {

    List<Property> properties;
    List<String> getters;
    List<String> setters;
    String classname;
    String serialVersionUID;
    String packages;


    public List<Property> getProperties() {
        return properties;
    }

    public void setProperties(List<Property> properties) {
        this.properties = properties;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public String getSerialVersionUID() {
        return serialVersionUID;
    }

    public void setSerialVersionUID(String serialVersionUID) {
        this.serialVersionUID = serialVersionUID;
    }

    public String getPackages() {
        return packages;
    }

    public void setPackages(String packages) {
        this.packages = packages;
    }

    public List<String> getGetters() {
        return getters;
    }

    public List<String> getSetters() {
        return setters;
    }

    public static class Property {
        String property;
        String getter;
        String camelcase;
        List<String> annotations;

        public Property(String property, List<String> annotations) {
            this.annotations = annotations;
            this.property = property;
            this.getter = "get"+StringUtils.capitalize(property);
            this.camelcase = StringUtils.capitalize(property);
        }
    }
}
