package com.vidhi.project.uber.uberapp.repositories;

import com.vidhi.project.uber.uberapp.entities.Driver;
import org.locationtech.jts.geom.Point;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DriverRepository extends JpaRepository<Driver, Long> {
    @Query(value = "SELECT d.*, ST_Distance(d.current_location, :pickUpLocation) AS distance " +
            "FROM drivers d where d.available=true AND ST_DWithin(d.current_location, :pickupLocation, 10000" +
            "ORDER BY DISTANCE " +
            "LIMIT 10", nativeQuery = true
    )
    List<Driver> findTenNearestDrivers(Point pickUpLocation);
}
