package com.weather.service;

import com.weather.dao.IWeatherDao;
import com.weather.model.Alert;
import com.weather.model.Current;
import com.weather.model.Daily;
import com.weather.model.Location;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class CurrentWeatherServiceTest {
    @Mock
    private IWeatherDao weatherDao;

    @Mock
    private Location fakeLocation;

    @Mock
    private Location fakeLocationWeather;

    @InjectMocks
    private CurrentWeatherService currentWeatherService;

    @BeforeEach
    void init(){
        MockitoAnnotations.openMocks(this);
    }


    @Test
    public void Given_A_Location_Lat_Lon_Then_Return_Location_Weather_Data() throws IOException, InterruptedException{
        when(weatherDao.getCurrentWeatherAndForecast(fakeLocation)).thenReturn(fakeLocationWeather);
        assertEquals(fakeLocationWeather, currentWeatherService.getCurrentWeatherAndForecast(fakeLocation));
    }
}