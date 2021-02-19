package com.company.task5;

import java.lang.reflect.Proxy;

public class Task5 {

    public static void main(String[] args) {
        Function function = new Function();

        Evaluatable e = (Evaluatable) Proxy
                .newProxyInstance(
                        function.getClass().getClassLoader()
                        ,function.getClass().getInterfaces()
                        ,new FunHandler(function));
        e.evalf(5);

        System.out.println(function.evalf(5));
    }
}
