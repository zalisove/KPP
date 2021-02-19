package com.company.task2;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Optional;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        TestClass testClass = new TestClass(5,46);

        Class analClass = testClass.getClass();

        Field[] fields = analClass.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            try {
                System.out.println(field.toString() + " = " + field.get(testClass));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        System.out.println();

        Method[] methods = analClass.getDeclaredMethods();

        for (int i = 0; i < methods.length; i++) {
            methods[i].setAccessible(true);
            System.out.println((i+1) + ") " + methods[i].toString());
        }

        System.out.print("Виберить без параметров:");

        try {
            System.out.println(Optional.ofNullable(methods[scanner.nextInt()-1].invoke(testClass)).orElse("Void"));
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }

    }

}
