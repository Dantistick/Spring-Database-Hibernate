package com.example.MyFirstSpring.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "planet", schema = "galaxy")
public class PlanetEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_planet")
    private int idPlanet;
    @Basic
    @Column(name = "name_planet")
    private String namePlanet;
    @Basic
    @Column(name = "radius_planet")
    private double radiusPlanet;
    @Basic
    @Column(name = "core_temperature")
    private double coreTemperature;
    @Basic
    @Column(name = "is_atmosphere")
    private boolean isAtmosphere;
    @Basic
    @Column(name = "presence_of_life")
    private boolean presenceOfLife;
    @Basic
    @Column(name = "id_galaxy")
    private int idGalaxy;

    public int getIdPlanet() {
        return idPlanet;
    }

    public void setIdPlanet(int idPlanet) {
        this.idPlanet = idPlanet;
    }

    public String getNamePlanet() {
        return namePlanet;
    }

    public void setNamePlanet(String namePlanet) {
        this.namePlanet = namePlanet;
    }

    public double getRadiusPlanet() {
        return radiusPlanet;
    }

    public void setRadiusPlanet(double radiusPlanet) {
        this.radiusPlanet = radiusPlanet;
    }

    public double getCoreTemperature() {
        return coreTemperature;
    }

    public void setCoreTemperature(double coreTemperature) {
        this.coreTemperature = coreTemperature;
    }

    public boolean isAtmosphere() {
        return isAtmosphere;
    }

    public void setAtmosphere(boolean atmosphere) {
        isAtmosphere = atmosphere;
    }

    public boolean isPresenceOfLife() {
        return presenceOfLife;
    }

    public void setPresenceOfLife(boolean presenceOfLife) {
        this.presenceOfLife = presenceOfLife;
    }

    public int getIdGalaxy() {
        return idGalaxy;
    }

    public void setIdGalaxy(int idGalaxy) {
        this.idGalaxy = idGalaxy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlanetEntity that = (PlanetEntity) o;
        return idPlanet == that.idPlanet && Double.compare(radiusPlanet, that.radiusPlanet) == 0 && Double.compare(coreTemperature, that.coreTemperature) == 0 && isAtmosphere == that.isAtmosphere && presenceOfLife == that.presenceOfLife && idGalaxy == that.idGalaxy && Objects.equals(namePlanet, that.namePlanet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPlanet, namePlanet, radiusPlanet, coreTemperature, isAtmosphere, presenceOfLife, idGalaxy);
    }
}
