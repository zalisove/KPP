package com.company.task4;

import java.lang.reflect.Array;

public class ArraysReflect {

    static Object makeMass(Class<?> massClass,int rol,int col){
        return Array.newInstance(massClass,rol,col);
    }

    static Object makeMass(Class<?> massClass,int rol){
        Object mass = Array.newInstance(massClass,rol);
        randomInt(mass);
        return mass;
    }

    static Object resizeMass(Object object,int newRol,int newCol){
        Class<?> obClass = object.getClass();
        Object newMass;

        if (obClass.isArray()) {

            Class<?> tmpClass = obClass;
            Object tmpObject = object;
            while (tmpClass.isArray() && tmpClass.getComponentType().getComponentType() != null){
                tmpObject = Array.get(tmpObject,0);
                tmpClass = tmpObject.getClass();
            }
            newMass = Array.newInstance(tmpClass.getComponentType(),newRol,newCol);

            if (obClass.getComponentType().isArray()) {
                for (int i = 0; i < Math.min(newRol, Array.getLength(object)); i++) {
                    System.arraycopy(Array.get(object, i), 0,
                            Array.get(newMass, i), 0,
                            Math.min(newCol, Array.getLength(object)));
                }
            }else{
                System.arraycopy(object,0,  Array.get(newMass, 0),0, Math.min(newCol, Array.getLength(object)));
            }
            return newMass;
        }else return object;
    }

    static Object resizeMass(Object object,int len){
        Class<?> obClass = object.getClass();
        Object newMass;

        if (obClass.isArray()) {
            Class<?> tmpClass = obClass;
            Object tmpObject = object;
            while (tmpClass.isArray() && tmpClass.getComponentType().getComponentType() != null){
                tmpObject = Array.get(tmpObject,0);
                tmpClass = tmpObject.getClass();
            }
            newMass = Array.newInstance(tmpClass.getComponentType(),len);
            if (obClass.getComponentType().isArray()) {
                for (int i = 0; i < Math.min(Array.getLength(newMass), Array.getLength(object)); i++) {
                    System.arraycopy(Array.get(object, i), 0,
                            newMass, 0,
                            Math.min(len, Array.getLength(object)));
                }
            }else {
                System.arraycopy(Array.get(object, 0), 0, newMass, 0, Math.min(len, Array.getLength(object)));
            }
            return newMass;
        }else return object;
    }

    public static String massToString(Object object){

        if (object == null) {
            return "null";
        }

        Class<?> obClass = object.getClass();

        if (!obClass.isArray())return object.toString();

        StringBuilder builder = new StringBuilder();

        int iMax = Array.getLength(object)-1;
        builder.append("[");
        for (int i = 0;; i++) {
            builder.append(massToString(Array.get(object,i)));
            if (i == iMax)
                return builder.append("]\n").toString();
            builder.append(", ");
        }
    }

    private static void randomInt(Object object){
        Class<?> obClass = object.getClass();
        if (obClass.isArray() && obClass.getComponentType().equals(int.class)){
            for (int i = 0; i < Array.getLength(object); i++) {
                System.out.println(obClass.getComponentType());
                Array.set(object,i,(int)(Math.random()*6000));
            }
        }
    }

}
