package com.vidhi.project.uber.uberapp.strategies.impl;

import com.vidhi.project.uber.uberapp.dto.RideRequestDto;
import com.vidhi.project.uber.uberapp.entities.RideRequest;
import com.vidhi.project.uber.uberapp.services.DistanceService;
import com.vidhi.project.uber.uberapp.strategies.RideFareCalculationStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RideFareDefaultFareCalculationStrategy implements RideFareCalculationStrategy {

    private final DistanceService distanceService;
    @Override
    public double calculateFare(RideRequest rideRequest) {
        Double distance = distanceService.calculateDistance(rideRequest.getPickUpLocation(), rideRequest.getDropOffLocation());
        return distance * RIDE_FARE_MULTIPLIER;
    }
}
