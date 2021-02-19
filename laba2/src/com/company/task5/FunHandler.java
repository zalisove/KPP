package com.company.task5;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class FunHandler implements InvocationHandler {
    private Evaluatable original;

    public FunHandler(Evaluatable original) {
        this.original = original;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        long start = System.currentTimeMillis();
        Object res = method.invoke(original, args);
        System.out.println(System.currentTimeMillis() - start);

        System.out.println("Method name: " + method.getName());
        System.out.println("Method parameters: ");

        for (Parameter parameter : method.getParameters()) {
            System.out.println(parameter.toString());
        }

        System.out.println("Result: " + res);

        return res;
    }
}
