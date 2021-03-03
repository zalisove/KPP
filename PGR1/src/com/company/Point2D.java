package com.company;


public class Point2D extends Point implements Comparable<Point2D> {

    public Point2D(double x, double y) {
        super(2);
        setCord(1, x);
        setCord(2, y);
    }
    public Point2D() {
        this(0, 0);
    }
    public double getX() {
        return getCord(1);
    }
    public void setX(double x) {
        setCord(1, x);
    }
    public double getY() {
        return getCord(2);
    }
    public void setY(double y) {
        setCord(2, y);
    }

    @Override
    public int compareTo(Point2D pt) {
        return Double.compare(getX(), pt.getX());
    }

}
