package com.vidhi.project.uber.uberapp.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.locationtech.jts.geom.Point;

@Entity
@Getter
@Setter
public class Driver {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double rating;

    @OneToOne
    @JoinColumn(name="user_id")
    private User user;

    private Boolean isAvailable;

    @Column(columnDefinition = "Geometry(Point,4326)")
    Point currentLocation;
}
