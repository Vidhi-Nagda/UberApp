package com.vidhi.project.uber.uberapp.services.impl;

import com.vidhi.project.uber.uberapp.services.DistanceService;
import org.locationtech.jts.geom.Point;
import org.springframework.stereotype.Service;

@Service
public class DistanceServiceOSRMImpl implements DistanceService {
    @Override
    public double calculateDistance(Point src, Point dest) {
        //TODO: Call the 3rd party API called OSRM to fetch the distance
        return 0;
    }
}
