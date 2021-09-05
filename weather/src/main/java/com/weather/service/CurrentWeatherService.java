package com.weather.service;

import com.weather.dao.IWeatherDao;
import com.weather.model.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class CurrentWeatherService implements ICurrentWeatherService {
    @Autowired
    private IWeatherDao weatherDao;
    @Override
    public Location getCurrentWeatherAndForecast(Location location) throws IOException, InterruptedException {

        return weatherDao.getCurrentWeatherAndForecast(location);
    }

}
