package com.vidhi.project.uber.uberapp.dto;

import com.vidhi.project.uber.uberapp.entities.Rider;
import com.vidhi.project.uber.uberapp.entities.enums.PaymentMethod;
import com.vidhi.project.uber.uberapp.entities.enums.RideRequestStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RideRequestDto {

    private Long id;

    private PointDto pickUpLocation;

    private PointDto dropOffLocation;

    private PaymentMethod paymentMethod;

    private LocalDateTime requestedTime;

    private RiderDto rider;

    private RideRequestStatus rideRequestStatus;
}
