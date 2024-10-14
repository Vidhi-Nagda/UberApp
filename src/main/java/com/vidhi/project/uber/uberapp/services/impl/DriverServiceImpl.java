package com.vidhi.project.uber.uberapp.services.impl;

import com.vidhi.project.uber.uberapp.dto.DriverDto;
import com.vidhi.project.uber.uberapp.dto.RideDto;
import com.vidhi.project.uber.uberapp.dto.RiderDto;
import com.vidhi.project.uber.uberapp.services.DriverService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverServiceImpl implements DriverService {
    @Override
    public RideDto cancelRide(Long rideId) {
        return null;
    }

    @Override
    public RiderDto startRide(Long rideId) {
        return null;
    }

    @Override
    public RiderDto endRide(Long rideId) {
        return null;
    }

    @Override
    public RiderDto acceptRide(Long rideId) {
        return null;
    }

    @Override
    public RiderDto raterider(Long rideId, Integer rating) {
        return null;
    }

    @Override
    public DriverDto getmyProfile() {
        return null;
    }

    @Override
    public List<RideDto> getAllRides() {
        return null;
    }
}
