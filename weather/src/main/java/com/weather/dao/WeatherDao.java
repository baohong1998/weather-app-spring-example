package com.weather.dao;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.weather.WeatherApplication;
import com.weather.httpclient.WeatherHttpClient;
import com.weather.model.Location;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.weather.service.ICurrentWeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WeatherDao implements IWeatherDao {
    private final HttpClient httpClient;
    private final String API_KEY = "7ee1c03acb28ae01592b742dd5eec550";

    @Autowired
    WeatherDao(WeatherHttpClient httpClient){
        this.httpClient = httpClient.getHttpClient();
    }
    @Override
    public Location getCurrentWeatherAndForecast(Location location) throws IOException, InterruptedException {
        Double lat = location.getLat();
        Double lon = location.getLon();
        String url = "https://api.openweathermap.org/data/2.5/onecall?lat="+ lat + "&lon="+lon+"&exclude=hourly,minutely"+"&appid="+API_KEY;
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create(url))
                .setHeader("Content-Type", "application/json")
                .build();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        GsonBuilder builder = new GsonBuilder();

        Gson gson = builder.create();

        return gson.fromJson(response.body(), Location.class);
    }

}
