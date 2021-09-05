package com.weather.controller;

import com.weather.dao.ICoordinateDao;
import com.weather.model.Location;
import com.weather.service.ICoordinateService;
import com.weather.service.ICurrentWeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/api")
public class WeatherController {
    @Autowired
    private ICurrentWeatherService currentWeatherService;
    @Autowired
    private ICoordinateService coordinateService;
    @GetMapping("/get/{location}")
    public Location getCurrentWeatherAndForecast(@PathVariable String location) throws IOException, InterruptedException {
        Location local = coordinateService.getCoordinateFromLocation(location);
        return currentWeatherService.getCurrentWeatherAndForecast(local);
    }
}
