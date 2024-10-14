package com.vidhi.project.uber.uberapp.services;

import com.vidhi.project.uber.uberapp.dto.DriverDto;
import com.vidhi.project.uber.uberapp.dto.RideDto;
import com.vidhi.project.uber.uberapp.dto.RiderDto;
import com.vidhi.project.uber.uberapp.entities.Ride;

import java.util.List;

public interface DriverService {
    RideDto cancelRide(Long rideId);

    RiderDto startRide(Long rideId);

    RiderDto endRide(Long rideId);

    RiderDto acceptRide(Long rideId);

    RiderDto raterider(Long rideId, Integer rating);

    DriverDto getmyProfile();

    List<RideDto> getAllRides();

}
