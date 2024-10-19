package com.vidhi.project.uber.uberapp.strategies.impl;

import com.vidhi.project.uber.uberapp.dto.RideRequestDto;
import com.vidhi.project.uber.uberapp.entities.RideRequest;
import com.vidhi.project.uber.uberapp.strategies.RideFareCalculationStrategy;

public class RideFareSurgePricingFareCalculationStrategy implements RideFareCalculationStrategy {
    @Override
    public double calculateFare(RideRequest rideRequest) {
        return 0;
    }
}
