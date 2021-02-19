package com.company.task4;



public class Task4 {

    public static void main(String[] args) {
        Object mass = ArraysReflect.makeMass(int.class,5);

        System.out.println(ArraysReflect.massToString(mass));

        mass = ArraysReflect.resizeMass(mass,6,5);

        System.out.println(ArraysReflect.massToString(mass));
    }
}
