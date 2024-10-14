package com.vidhi.project.uber.uberapp.strategies;

import com.vidhi.project.uber.uberapp.dto.RideRequestDto;

public interface RideFareCalculationStrategy {
    double calculateFare(RideRequestDto rideRequestDto);
}
