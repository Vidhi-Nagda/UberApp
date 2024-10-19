package com.vidhi.project.uber.uberapp.services.impl;

import com.vidhi.project.uber.uberapp.dto.DriverDto;
import com.vidhi.project.uber.uberapp.dto.RideDto;
import com.vidhi.project.uber.uberapp.dto.RideRequestDto;
import com.vidhi.project.uber.uberapp.dto.RiderDto;
import com.vidhi.project.uber.uberapp.entities.RideRequest;
import com.vidhi.project.uber.uberapp.entities.Rider;
import com.vidhi.project.uber.uberapp.entities.User;
import com.vidhi.project.uber.uberapp.entities.enums.RideRequestStatus;
import com.vidhi.project.uber.uberapp.repositories.RideRequestRepository;
import com.vidhi.project.uber.uberapp.repositories.RiderRepository;
import com.vidhi.project.uber.uberapp.services.RiderService;
import com.vidhi.project.uber.uberapp.strategies.DriverMatchingStrategy;
import com.vidhi.project.uber.uberapp.strategies.impl.RideFareDefaultFareCalculationStrategy;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class RiderServiceImpl implements RiderService {

    private final ModelMapper modelMapper;
    private final RideFareDefaultFareCalculationStrategy rideFareDefaultFareCalculationStrategy;
    private final DriverMatchingStrategy driverMatchingStrategy;
    private final RideRequestRepository rideRequestRepository;
    private final RiderRepository riderRepository;

    @Override
    public RideRequestDto requestRide(RideRequestDto rideRequestDto) {
        RideRequest rideRequest = modelMapper.map(rideRequestDto,RideRequest.class);
        rideRequest.setRideRequestStatus(RideRequestStatus.PENDING);

        Double fare = rideFareDefaultFareCalculationStrategy.calculateFare(rideRequest);
        rideRequest.setFare(fare);

        RideRequest savedRideRequest = rideRequestRepository.save(rideRequest);
        driverMatchingStrategy.findMatchingDrivers(rideRequest);
//        log.info(rideRequest.toString());
        return modelMapper.map(savedRideRequest,RideRequestDto.class);
    }

    @Override
    public RideDto cancelRide(Long rideId) {
        return null;
    }

    @Override
    public DriverDto rateDriver(Long rideId, Integer rating) {
        return null;
    }

    @Override
    public RiderDto getmyProfile() {
        return null;
    }

    @Override
    public List<RideDto> getAllRides() {
        return null;
    }

    @Override
    public Rider createNewRider(User user) {
        Rider rider = Rider.builder().user(user).rating(0.0).build();
        return riderRepository.save(rider);
    }
}
