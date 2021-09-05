package com.weather.service;

import com.weather.dao.ICoordinateDao;
import com.weather.model.Location;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

class CoordinateServiceTest {
    @Mock
    private ICoordinateDao coordinateDao;

    @Mock
    private Location fakeLocation;

    @InjectMocks
    private CoordinateService coordinateService;

    @BeforeEach
    void init(){
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void Given_A_Location_city_Or_Zip_Then_Return_New_Location_With_Lat_Lon() throws IOException, InterruptedException {
        when(coordinateDao.getCoordinateFromLocation(anyString())).thenReturn(fakeLocation);
        assertEquals(fakeLocation, coordinateService.getCoordinateFromLocation(anyString()));
    }
}