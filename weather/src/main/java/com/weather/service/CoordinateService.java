package com.weather.service;

import com.weather.dao.ICoordinateDao;
import com.weather.model.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class CoordinateService implements ICoordinateService {

    private ICoordinateDao coordinateDao;
    @Autowired
    CoordinateService(ICoordinateDao coordinateDao){
        this.coordinateDao = coordinateDao;
    }
    @Override
    public Location getCoordinateFromLocation(String location) throws IOException, InterruptedException {
        return coordinateDao.getCoordinateFromLocation(location);
    }
}
