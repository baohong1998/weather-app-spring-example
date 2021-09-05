package com.weather.dao;

import com.weather.model.Location;

import java.io.IOException;

public interface ICoordinateDao {
    Location getCoordinateFromLocation(String location) throws IOException, InterruptedException;
}
