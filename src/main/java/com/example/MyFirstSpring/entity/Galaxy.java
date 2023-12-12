package com.example.MyFirstSpring.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "galaxy", schema = "galaxy")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Galaxy {

    @Id
    @Column(name = "id_galaxy", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idGalaxy;

    @Basic
    @Column(name = "name_galaxy", nullable = false)
    private String nameGalaxy;

}
