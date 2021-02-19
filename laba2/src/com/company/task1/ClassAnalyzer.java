package com.company.task1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Optional;

public class ClassAnalyzer {

    private String packageName = null;
    private String className = null;
    private String interfaces = null;
    private String constructor = null;
    private String files = null;
    private String methods = null;

    private ClassAnalyzer(){}


    public String getPackageName() {
        return packageName;
    }

    public String getClassName() {
        return className;
    }

    public String getInterfaces() {
        return interfaces;
    }

    public String getConstructor() {
        return constructor;
    }

    public String getFiles() {
        return files;
    }

    public String getMethods() {
        return methods;
    }

    public static Builder newBuilder(Class analClass){
        return new ClassAnalyzer().new Builder(analClass);
    }
    public static Builder newBuilder(String className) throws ClassNotFoundException {
        return new ClassAnalyzer().new Builder(className);
    }
    public class Builder {
        private Class analClass;

        private Builder(Class analClass){
            this.analClass = analClass;
        }

        private Builder(String className) throws ClassNotFoundException {
            this.analClass = Class.forName(className);
        }

        public Builder addPackageName() {
            ClassAnalyzer.this.packageName = analClass.getPackageName();
            return this;
        }

        public Builder addClassName() {
            ClassAnalyzer.this.className = analClass.toGenericString();
            return this;
        }

        public Builder addInterfaces() {
            StringBuilder builder = new StringBuilder();
            Class[] interfaces = analClass.getInterfaces();
            for (Class c : interfaces) {
                builder.append(c.getSimpleName()).append(" ");
            }
            ClassAnalyzer.this.interfaces = builder.toString();
            return this;
        }

        public Builder addConstructor() {
            StringBuilder builder = new StringBuilder();
            Constructor[] constructors = analClass.getDeclaredConstructors();
            for (Constructor c : constructors) {
                builder.append(c.toString()).append("\n");
            }
            ClassAnalyzer.this.constructor = builder.toString();
            return this;
        }

        public Builder addFiles() {
            StringBuilder builder = new StringBuilder();
            Field[] fields = analClass.getDeclaredFields();
            for (Field c : fields) {
                builder.append(c.toString()).append("\n");
            }
            ClassAnalyzer.this.files = builder.toString();
            return this;
        }

        public Builder addMethods() {
            StringBuilder builder = new StringBuilder();
            Method[] methods = analClass.getDeclaredMethods();
            for (Method c : methods) {
                builder.append(c.toString()).append("\n");
            }
            ClassAnalyzer.this.methods = builder.toString();
            return this;
        }

        public ClassAnalyzer build(){
            return ClassAnalyzer.this;
        }
    }

    @Override
    public String toString() {

        return
                (Optional.ofNullable(packageName).orElse("")) + "\n" +
                (Optional.ofNullable(className).orElse("")) + "\n\n" +
                (Optional.ofNullable(interfaces).orElse("")) + "\n\n" +
                (Optional.ofNullable(files).orElse("")) + "\n" +
                (Optional.ofNullable(constructor).orElse("")) + "\n" +
                (Optional.ofNullable(methods).orElse(""));
    }
}
