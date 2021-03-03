package com.company;

abstract public class Point {

    private double[] coords;

    public Point(int num) {
        this.coords = new double[num];
    }
    public void setCord(int num, double x) {
        coords[num-1] = x;
    }

    public double getCord(int num) {
        return coords[num-1];
    }
    @Override
    public String toString() {

        StringBuilder res = new StringBuilder("(");
        for (double x : coords) {
            res.append(x).append(", ");
        }
        return res.substring(0, res.length()-2) + ")";
    }
}
