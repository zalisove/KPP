package com.company.interpolator.treeSet;

import com.company.Point2D;
import com.company.interpolator.Interpolator;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetInterpolation extends Interpolator {

    private final TreeSet<Point2D> set;

    public TreeSetInterpolation() {
        this.set = new TreeSet<>();
    }


    public void clear() {
        set.clear();
    }

    @Override
    public int numPoints() {
        return set.size();
    }

    public void addPoint(Point2D pt) {
        set.add(pt);
    }

    @Override
    public Point2D getPoint(int i) {
        var iterator = getIterator();

        for (int count = 0; iterator.hasNext() && count < i; count++){
            iterator.next();
        }
        if (iterator.hasNext()) return iterator.next();
        else return null;
    }

    @Override
    public void setPoint(int i, Point2D pt) {
        var iterator = getIterator();

        for (int count = 0; iterator.hasNext() && count < i; count++){
            iterator.next();
        }
        var oldPoint = iterator.next();
        oldPoint.setX(pt.getX());
        oldPoint.setY(pt.getY());
    }

    @Override
    public void removeLastPoint() {
       set.pollLast();
    }

    @Override
    public void sort() {
        // TODO: не потрібно відсортовувати
    }

    public Iterator<Point2D> getIterator(){
        return set.iterator();
    }

}
