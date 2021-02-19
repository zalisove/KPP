package com.company.task2;

public class TestClass {
    private double x;
    private double y;

    public TestClass(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double Sum(){
        return x+y;
    }

    public double getRandom(){
        return Math.random();
    }

    private void voidMethod(){}

    @Override
    public String toString() {
        return "TestClass{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public double Sum(int x, int y){return x+y; }
}
