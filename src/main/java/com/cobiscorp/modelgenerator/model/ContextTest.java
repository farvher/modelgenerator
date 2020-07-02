package com.cobiscorp.modelgenerator.model;

import java.util.List;

public class ContextTest {

    List<Test> tests;
    String className;

    public ContextTest(List<Test> tests, String className) {
        this.tests = tests;
        this.className = className;
    }

    public static class Test {

        String textName;
        String dtoName;
        List<String> properties;
        String propertyAssert;
        String transformation;
        List<String> asserts;

        public String getTextName() {
            return textName;
        }

        public void setTextName(String textName) {
            this.textName = textName;
        }

        public String getDtoName() {
            return dtoName;
        }

        public void setDtoName(String dtoName) {
            this.dtoName = dtoName;
        }

        public List<String> getProperties() {
            return properties;
        }

        public void setProperties(List<String> properties) {
            this.properties = properties;
        }

        public String getPropertyAssert() {
            return propertyAssert;
        }

        public void setPropertyAssert(String propertyAssert) {
            this.propertyAssert = propertyAssert;
        }

        public String getTransformation() {
            return transformation;
        }

        public void setTransformation(String transformation) {
            this.transformation = transformation;
        }

        public List<String> getAsserts() {
            return asserts;
        }

        public void setAsserts(List<String> asserts) {
            this.asserts = asserts;
        }
    }

}
