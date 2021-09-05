package com.weather.httpclient;

import org.springframework.stereotype.Component;

import java.net.http.HttpClient;

@Component
public class WeatherHttpClient {
    private final HttpClient httpClient = HttpClient.newBuilder()
            .version(HttpClient.Version.HTTP_2)
            .build();
    public HttpClient getHttpClient() {
        return httpClient;
    }
}
