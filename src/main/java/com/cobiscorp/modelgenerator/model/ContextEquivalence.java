package com.cobiscorp.modelgenerator.model;

import org.apache.commons.lang3.math.NumberUtils;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Objects;

public class ContextEquivalence {

    String className;
    List<Method> methods;
    String from;
    String to;
    String request;
    String response;


    public List<Method> getMethods() {
        return methods;
    }

    public void setMethods(List<Method> methods) {
        this.methods = methods;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public static class Method {

        String methodName;
        String returnType;
        String paramType;
        String param;
        List<Conditions> conditions;

        public String getMethodName() {
            return methodName;
        }

        public void setMethodName(String methodName) {
            this.methodName = methodName;
        }

        public String getReturnType() {
            return returnType;
        }

        public void setReturnType(String returnType) {
            this.returnType = returnType;
        }

        public String getParamType() {
            return paramType;
        }

        public void setParamType(String paramType) {
            this.paramType = paramType;
        }

        public String getParam() {
            return param;
        }

        public void setParam(String param) {
            this.param = param;
        }

        public List<Conditions> getConditions() {
            return conditions;
        }

        public void setConditions(List<Conditions> conditions) {
            this.conditions = conditions;
        }
    }

    public static class Conditions {
        String equivalence;
        String code;

        public Conditions(String equivalence, String code) {
            this.equivalence =  "\"" + equivalence +"\"";
            this.code =  "\"" + code + "\"";
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Conditions that = (Conditions) o;
            return Objects.equals(equivalence, that.equivalence) &&
                    Objects.equals(code, that.code);
        }

        @Override
        public int hashCode() {
            return Objects.hash(equivalence, code);
        }
    }
}
