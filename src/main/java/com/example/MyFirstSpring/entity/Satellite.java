package com.example.MyFirstSpring.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "satellite", schema = "galaxy")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Satellite {

    @Id
    @Column(name = "id_satellite", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSatellite;

    @Basic
    @Column(name = "name_satellite", nullable = false)
    private String nameSatellite;

    @Basic
    @Column(name = "radius_satellite", nullable = false)
    private double radiusSatellite;

    @Basic
    @Column(name = "distance_to_the_planet", nullable = false)
    private double distanceToThePlanet;

    @Basic
    @Column(name = "id_planet", nullable = false)
    private int idPlanet;
}
