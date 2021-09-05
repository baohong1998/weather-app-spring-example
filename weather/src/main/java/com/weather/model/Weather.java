package com.weather.model;

public class Weather {
    private Integer id;
    private String main;

    public Integer getId() {
        return id;
    }

    public String getMain() {
        return main;
    }

    public String getDescription() {
        return description;
    }

    public String getIcon() {
        return icon;
    }

    private String description;
    private String icon;
}
