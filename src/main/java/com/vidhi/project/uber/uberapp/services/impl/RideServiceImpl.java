package com.vidhi.project.uber.uberapp.services.impl;

import com.vidhi.project.uber.uberapp.dto.DriverDto;
import com.vidhi.project.uber.uberapp.dto.RideDto;
import com.vidhi.project.uber.uberapp.dto.RideRequestDto;
import com.vidhi.project.uber.uberapp.dto.RiderDto;
import com.vidhi.project.uber.uberapp.entities.Driver;
import com.vidhi.project.uber.uberapp.entities.Ride;
import com.vidhi.project.uber.uberapp.entities.enums.RideStatus;
import com.vidhi.project.uber.uberapp.services.RideService;
import com.vidhi.project.uber.uberapp.services.RiderService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RideServiceImpl implements RideService {

    @Override
    public Ride getRideById(Long rideId) {
        return null;
    }

    @Override
    public void matchWithDrivers(RideRequestDto rideRequestDto) {

    }

    @Override
    public Ride createNewRide(RideRequestDto rideRequestDto, Driver driver) {
        return null;
    }

    @Override
    public Ride updateRideStatus(Long rideId, RideStatus rideStatus) {
        return null;
    }

    @Override
    public Page<Ride> getAllRidesOfRider(Long riderId, PageRequest pageRequest) {
        return null;
    }

    @Override
    public Page<Ride> getAllRidesOfDriver(Long driverId, PageRequest pageRequest) {
        return null;
    }
}
