package com.weather.model;

public class Temp {
    private Double day;
    private Double min;
    private Double max;

    public Double getDay() {
        return day;
    }

    public Double getMin() {
        return min;
    }

    public Double getMax() {
        return max;
    }

    public Double getNight() {
        return night;
    }

    public Double getEve() {
        return eve;
    }

    public Double getMorn() {
        return morn;
    }

    private Double night;
    private Double eve;
    private Double morn;
}
