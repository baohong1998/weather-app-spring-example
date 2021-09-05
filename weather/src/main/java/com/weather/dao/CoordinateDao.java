package com.weather.dao;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.weather.httpclient.WeatherHttpClient;
import com.weather.model.GoogleResponse;
import com.weather.model.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Component
public class CoordinateDao implements ICoordinateDao {
    private final HttpClient httpClient;
    private final String GOOGLE_API_KEY ="AIzaSyA_udxkw11tn1qUnTqxwE-2Z_hGtXk35Sg";

    @Autowired
    CoordinateDao(WeatherHttpClient httpClient){
        this.httpClient = httpClient.getHttpClient();
    }
    @Override
    public Location getCoordinateFromLocation(String location) throws IOException, InterruptedException {
        String url = "https://maps.googleapis.com/maps/api/geocode/json?address="+location+ "&key="+GOOGLE_API_KEY;
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create(url))
                .setHeader("Content-Type", "application/json")
                .build();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        GsonBuilder builder = new GsonBuilder();

        Gson gson = builder.create();

        GoogleResponse googleResult = gson.fromJson(response.body(), GoogleResponse.class);

        return googleResult.getResults()[0].getGeometry().getLocation();
    }
}
