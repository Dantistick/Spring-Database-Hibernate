package com.example.MyFirstSpring.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "planet", schema = "galaxy")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Planet {

    @Id
    @Column(name = "id_planet")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPlanet;

    @Basic
    @Column(name = "name_planet", nullable = false)
    private String namePlanet;

    @Basic
    @Column(name = "radius_planet", nullable = false)
    private double radiusPlanet;

    @Basic
    @Column(name = "core_temperature", nullable = false)
    private double coreTemperature;

    @Basic
    @Column(name = "is_atmosphere", nullable = false)
    private boolean isAtmosphere;

    @Basic
    @Column(name = "presence_of_life", nullable = false)
    private boolean presenceOfLife;

    @Basic
    @Column(name = "id_galaxy", nullable = false)
    private int idGalaxy;
}
