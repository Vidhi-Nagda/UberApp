package com.vidhi.project.uber.uberapp.strategies;

import com.vidhi.project.uber.uberapp.dto.RideRequestDto;
import com.vidhi.project.uber.uberapp.entities.RideRequest;

public interface RideFareCalculationStrategy {

    double RIDE_FARE_MULTIPLIER = 10;
    double calculateFare(RideRequest rideRequest);
}
