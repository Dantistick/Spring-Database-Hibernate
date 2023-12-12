package com.example.MyFirstSpring.Controllers;

import com.example.MyFirstSpring.entity.Satellite;
import com.example.MyFirstSpring.repository.SatelliteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import org.springframework.ui.Model;;

@Controller
public class SatelliteController {

    private final SatelliteRepository satelliteRepository;

    @Autowired
    public SatelliteController(SatelliteRepository satelliteRepository) {
        this.satelliteRepository = satelliteRepository;
    }

    @GetMapping("/satellites")
    public String showGalaxies(Model model) {
        List<Satellite> satellites = satelliteRepository.findAll();
        model.addAttribute("satellites", satellites);
        return "satellite-list";
    }
}
