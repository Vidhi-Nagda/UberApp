package com.vidhi.project.uber.uberapp.repositories;

import com.vidhi.project.uber.uberapp.entities.RideRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RideRequestRepository extends JpaRepository<RideRequest,Long> {
}
