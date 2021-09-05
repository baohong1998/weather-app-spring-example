package com.weather.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Location {
    public Double getLat() {
        return lat;
    }

    public Double getLon() {
        return lon;
    }

    private Double lat;
    @SerializedName(value = "lon", alternate = {"lng"})
    private Double lon;
    private String timezone;

    public String getTimezone() {
        return timezone;
    }

    public Integer getTimezoneOffset() {
        return timezoneOffset;
    }

    public Current getCurrent() {
        return current;
    }

    public List<Daily> getDaily() {
        return daily;
    }

    public List<Alert> getAlerts() {
        return alerts;
    }

    @SerializedName("timezone_offset")
    private Integer timezoneOffset;
    private Current current;
    private List<Daily> daily;
    private List<Alert> alerts;

}
