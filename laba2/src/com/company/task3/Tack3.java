package com.company.task3;

import java.lang.reflect.Method;
import java.util.Optional;

public class Tack3 {
    public static void main(String[] args) {
        TestClass testClass = new TestClass(45,46);

        try {
            System.out.println(Optional.ofNullable(starMethod("Sum",testClass, "s",5)).orElse("void"));
        } catch (FunctionNotFoundException e) {
            e.printStackTrace();
        }
        try {
            System.out.println(Optional.ofNullable(starMethod("Sum",testClass, 5,5)).orElse("void"));
        } catch (FunctionNotFoundException e) {
            e.printStackTrace();
        }
        try {
            System.out.println(Optional.ofNullable(starMethod("samsung",testClass, "s",5)).orElse("void"));
        } catch (FunctionNotFoundException e) {
            e.printStackTrace();
        }
        try {
            System.out.println(Optional.ofNullable(starMethod(null,testClass, "s",5)).orElse("void"));
        } catch (FunctionNotFoundException e) {
            e.printStackTrace();
        }


    }

    public static String  starMethod(String methodName,Object object,Object... params) throws FunctionNotFoundException {
        if (object == null || methodName == null) {
            throw new FunctionNotFoundException("Імя метода або обєкт == null");
        }
        Class<?> cls = object.getClass();
        Method[] methods = cls.getMethods();
        Method toInvoke = null;

        for (Method method : methods) {
            if (!methodName.equals(method.getName())) {
                continue;
            }
            Class<?>[] paramTypes = method.getParameterTypes();

            if (params == null && paramTypes == null) {
                toInvoke = method;
                break;
            } else if (params == null || paramTypes == null
                    || paramTypes.length != params.length) {
                continue;
            }
            toInvoke = method;
        }
        if (toInvoke != null) {
            try {
                return toInvoke.invoke(object, params).toString();
            } catch (Exception e) {
                throw new FunctionNotFoundException(e.getMessage());
            }
        }
        throw new FunctionNotFoundException("Нет метода з таким іменем");
    }
}
