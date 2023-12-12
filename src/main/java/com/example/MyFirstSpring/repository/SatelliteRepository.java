package com.example.MyFirstSpring.repository;

import com.example.MyFirstSpring.entity.Satellite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SatelliteRepository extends JpaRepository<Satellite, Integer> {
    List<Satellite> findAll();
    Optional<Satellite> findById(int id);
    void deleteById(int id);
}
