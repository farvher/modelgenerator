package com.cobiscorp.modelgenerator.model;

import java.util.List;

public class ContextTransform {

    String className;
    String stype;
    String ttype;
    List<Builder> builders;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getStype() {
        return stype;
    }

    public void setStype(String stype) {
        this.stype = stype;
    }

    public String getTtype() {
        return ttype;
    }

    public void setTtype(String ttype) {
        this.ttype = ttype;
    }

    public List<Builder> getBuilders() {
        return builders;
    }

    public void setBuilders(List<Builder> builders) {
        this.builders = builders;
    }

    public static class Builder {

        String getter;
        String setter;
        String valueType;
        String equivalentValue;
        String className;
        String methodName;


        public Builder(String getter, String setter) {
            this.getter = getter;
            this.setter = setter;
        }

        public Builder(String getter, String setter, String valueType,String className,String methodName) {
            this.getter = getter;
            this.setter = setter;
            this.valueType = valueType;
            this.className = className;
            this.methodName = methodName;

        }

        @Override
        public String toString() {
            String transform = "";
            if("C".equals(this.valueType)){
                transform = "(Eq"+className + "." + methodName + "(this.s.get"+this.getter+"()))";
            }else if ("Amount".equals(this.getter)){
                transform = "(this.s.get"+this.getter+"().toPlainString())";
            }else if ("Importe".equals(this.getter)){
                transform = "(new java.math.BigDecimal(this.s.get"+this.getter+"()))";
            }else {
                transform = "(this.s.get"+this.getter+"())";
            }
            return "."+this.setter +  transform +"//"+this.valueType;
        }

        public String getGetter() {
            return getter;
        }

        public void setGetter(String getter) {
            this.getter = getter;
        }

        public String getSetter() {
            return setter;
        }

        public void setSetter(String setter) {
            this.setter = setter;
        }
    }



}
