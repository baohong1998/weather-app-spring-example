package com.weather.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Current {
    public long getDt() {
        return dt;
    }

    public long getSunrise() {
        return sunrise;
    }

    public long getSunset() {
        return sunset;
    }

    public Double getTemp() {
        return temp;
    }

    public Double getFeelsLike() {
        return feelsLike;
    }

    public Double getPressure() {
        return pressure;
    }

    public Double getHumidity() {
        return humidity;
    }

    public Double getDewPoint() {
        return dewPoint;
    }

    public Double getUvi() {
        return uvi;
    }

    public Integer getClouds() {
        return clouds;
    }

    public Integer getVisibility() {
        return visibility;
    }

    public Double getWindSpeed() {
        return windSpeed;
    }

    public Double getWindDeg() {
        return windDeg;
    }

    public Double getWindGust() {
        return windGust;
    }

    public List<Weather> getWeather() {
        return weather;
    }

    private long dt;
    private long sunrise;
    private long sunset;
    private Double temp;
    @SerializedName("feels_like")
    private Double feelsLike;
    private Double pressure;
    private Double humidity;
    @SerializedName("dew_point")
    private Double dewPoint;
    private Double uvi;
    private Integer clouds;
    private Integer visibility;
    @SerializedName("wind_speed")
    private Double windSpeed;
    @SerializedName("wind_deg")
    private Double windDeg;
    @SerializedName("wind_gust")
    private Double windGust;
    private List<Weather> weather;
}
