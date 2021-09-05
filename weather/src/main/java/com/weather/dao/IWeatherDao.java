package com.weather.dao;

import com.weather.model.Location;

import java.io.IOException;

public interface IWeatherDao {
    Location getCurrentWeatherAndForecast(Location location) throws IOException, InterruptedException;
}
