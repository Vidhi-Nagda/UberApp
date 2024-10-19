package com.vidhi.project.uber.uberapp.strategies.impl;

import com.vidhi.project.uber.uberapp.dto.RideRequestDto;
import com.vidhi.project.uber.uberapp.entities.Driver;
import com.vidhi.project.uber.uberapp.entities.RideRequest;
import com.vidhi.project.uber.uberapp.strategies.DriverMatchingStrategy;

import java.util.List;

public class DriverMatchingHighestRatedStrategy implements DriverMatchingStrategy {
    @Override
    public List<Driver> findMatchingDrivers(RideRequest rideRequest) {
        return null;
    }
}
