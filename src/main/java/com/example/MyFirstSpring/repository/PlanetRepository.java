package com.example.MyFirstSpring.repository;

import com.example.MyFirstSpring.entity.Planet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PlanetRepository extends JpaRepository<Planet, Integer> {
    List<Planet> findAll();
    Optional<Planet> findById(int id);
    void deleteById(int id);
}
