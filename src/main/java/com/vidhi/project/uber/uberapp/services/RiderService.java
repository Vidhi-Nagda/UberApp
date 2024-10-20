package com.vidhi.project.uber.uberapp.services;

import com.vidhi.project.uber.uberapp.dto.DriverDto;
import com.vidhi.project.uber.uberapp.dto.RideDto;
import com.vidhi.project.uber.uberapp.dto.RideRequestDto;
import com.vidhi.project.uber.uberapp.dto.RiderDto;
import com.vidhi.project.uber.uberapp.entities.Rider;
import com.vidhi.project.uber.uberapp.entities.User;

import java.util.List;

public interface RiderService {
    RideDto cancelRide(Long rideId);

    RideRequestDto requestRide(RideRequestDto rideRequestDto);

    DriverDto rateDriver(Long rideId, Integer rating);

    RiderDto getmyProfile();

    List<RideDto> getAllRides();

    Rider createNewRider(User user);
}
