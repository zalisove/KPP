package com.company.task2;

public class Data {
    private String region = null;
    private String area = null;
    private double LCoordinate = 0;
    private double WCoordinate = 0;

    public Data(String region, String area, double LCoordinate, double WCoordinate) {
        this.region = region;
        this.area = area;
        this.LCoordinate = LCoordinate;
        this.WCoordinate = WCoordinate;
    }

    public Data() {}

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public double getLCoordinate() {
        return LCoordinate;
    }

    public void setLCoordinate(double LCoordinate) {
        this.LCoordinate = LCoordinate;
    }

    public double getWCoordinate() {
        return WCoordinate;
    }

    public void setWCoordinate(double WCoordinate) {
        this.WCoordinate = WCoordinate;
    }
}
