package com.example.MyFirstSpring.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "satellite", schema = "galaxy")
public class SatelliteEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_satellite")
    private int idSatellite;
    @Basic
    @Column(name = "name_satellite")
    private String nameSatellite;
    @Basic
    @Column(name = "radius_satellite")
    private double radiusSatellite;
    @Basic
    @Column(name = "distance_to_the_planet")
    private double distanceToThePlanet;
    @Basic
    @Column(name = "id_planet")
    private int idPlanet;

    public int getIdSatellite() {
        return idSatellite;
    }

    public void setIdSatellite(int idSatellite) {
        this.idSatellite = idSatellite;
    }

    public String getNameSatellite() {
        return nameSatellite;
    }

    public void setNameSatellite(String nameSatellite) {
        this.nameSatellite = nameSatellite;
    }

    public double getRadiusSatellite() {
        return radiusSatellite;
    }

    public void setRadiusSatellite(double radiusSatellite) {
        this.radiusSatellite = radiusSatellite;
    }

    public double getDistanceToThePlanet() {
        return distanceToThePlanet;
    }

    public void setDistanceToThePlanet(double distanceToThePlanet) {
        this.distanceToThePlanet = distanceToThePlanet;
    }

    public int getIdPlanet() {
        return idPlanet;
    }

    public void setIdPlanet(int idPlanet) {
        this.idPlanet = idPlanet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SatelliteEntity that = (SatelliteEntity) o;
        return idSatellite == that.idSatellite && Double.compare(radiusSatellite, that.radiusSatellite) == 0 && Double.compare(distanceToThePlanet, that.distanceToThePlanet) == 0 && idPlanet == that.idPlanet && Objects.equals(nameSatellite, that.nameSatellite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idSatellite, nameSatellite, radiusSatellite, distanceToThePlanet, idPlanet);
    }
}
