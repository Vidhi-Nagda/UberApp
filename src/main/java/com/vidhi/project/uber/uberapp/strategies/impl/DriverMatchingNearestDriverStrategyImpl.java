package com.vidhi.project.uber.uberapp.strategies.impl;

import com.vidhi.project.uber.uberapp.entities.Driver;
import com.vidhi.project.uber.uberapp.entities.RideRequest;
import com.vidhi.project.uber.uberapp.repositories.DriverRepository;
import com.vidhi.project.uber.uberapp.strategies.DriverMatchingStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DriverMatchingNearestDriverStrategyImpl implements DriverMatchingStrategy {

    private final DriverRepository driverRepository;

    @Override
    public List<Driver> findMatchingDrivers(RideRequest rideRequest) {
        return driverRepository.findTenNearestDrivers(rideRequest.getPickUpLocation());
    }
}
