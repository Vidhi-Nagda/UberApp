package com.vidhi.project.uber.uberapp.strategies;


import com.vidhi.project.uber.uberapp.dto.RideRequestDto;
import com.vidhi.project.uber.uberapp.entities.Driver;
import com.vidhi.project.uber.uberapp.entities.RideRequest;

import java.util.List;

public interface DriverMatchingStrategy {
    List<Driver> findMatchingDrivers(RideRequest rideRequest);
}
