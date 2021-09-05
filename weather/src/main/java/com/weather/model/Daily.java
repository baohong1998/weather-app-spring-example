package com.weather.model;

import com.google.gson.annotations.SerializedName;

public class Daily {
    public long getMoonrise() {
        return moonrise;
    }

    public long getMoonset() {
        return moonset;
    }

    public Double getMoonPhase() {
        return moonPhase;
    }

    public Temp getTemp() {
        return temp;
    }

    public FeelsLike getFeelsLike() {
        return feelsLike;
    }

    public Double getPop() {
        return pop;
    }

    private long moonrise;
    private long moonset;
    @SerializedName("moon_phase")
    private Double moonPhase;
    private Temp temp;
    @SerializedName("feels_like")
    private FeelsLike feelsLike;
    private Double pop;
}
