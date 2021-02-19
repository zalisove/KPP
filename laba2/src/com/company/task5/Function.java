package com.company.task5;

public class Function implements Evaluatable{
    @Override
    public double evalf(double x) {
        return Math.sin(x);
    }
}
