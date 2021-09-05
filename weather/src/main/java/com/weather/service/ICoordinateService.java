package com.weather.service;

import com.weather.model.Location;

import java.io.IOException;

public interface ICoordinateService {
    Location getCoordinateFromLocation(String location) throws IOException, InterruptedException;
}
