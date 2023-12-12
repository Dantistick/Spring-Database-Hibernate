package com.example.MyFirstSpring.repository;

import com.example.MyFirstSpring.entity.Galaxy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface GalaxyRepository extends JpaRepository<Galaxy, Integer> {
    List<Galaxy> findAll();
    Optional<Galaxy> findById(int id);
    void deleteById(int id);
}
