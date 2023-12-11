package com.example.MyFirstSpring.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "galaxy", schema = "galaxy")
public class GalaxyEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_galaxy")
    private int idGalaxy;
    @Basic
    @Column(name = "name_galaxy")
    private String nameGalaxy;

    public int getIdGalaxy() {
        return idGalaxy;
    }

    public void setIdGalaxy(int idGalaxy) {
        this.idGalaxy = idGalaxy;
    }

    public String getNameGalaxy() {
        return nameGalaxy;
    }

    public void setNameGalaxy(String nameGalaxy) {
        this.nameGalaxy = nameGalaxy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GalaxyEntity that = (GalaxyEntity) o;
        return idGalaxy == that.idGalaxy && Objects.equals(nameGalaxy, that.nameGalaxy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idGalaxy, nameGalaxy);
    }
}
