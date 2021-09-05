package com.weather.service;

import com.weather.model.Location;

import java.io.IOException;

public interface ICurrentWeatherService {
    Location getCurrentWeatherAndForecast(Location location) throws IOException, InterruptedException;
}
