package com.company.interpolator.list;

import com.company.Point2D;
import com.company.interpolator.Interpolator;

import java.util.*;

public class ListInterpolation extends Interpolator {

    private List<Point2D> data;

    public ListInterpolation(List<Point2D> data) {
        this.data = data;
    }

    public ListInterpolation() {
        data = new ArrayList<>();
    }
    public ListInterpolation(Point2D[] data) {
        this();
        this.data.addAll(Arrays.asList(data));
    }
    @Override
    public void clear() {
        data.clear();
    }
    @Override
    public int numPoints() {
        return data.size();
    }
    @Override
    public void addPoint(Point2D pt) {
        data.add(pt);
    }
    @Override
    public Point2D getPoint(int i) {
        return data.get(i);
    }
    @Override
    public void setPoint(int i, Point2D pt) {
        data.set(i, pt);
    }
    @Override
    public void removeLastPoint() {
        data.remove(data.size()-1);
    }
    @Override
    public void sort() {
        Collections.sort(data);
    }
}
