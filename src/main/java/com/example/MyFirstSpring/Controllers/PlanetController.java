package com.example.MyFirstSpring.Controllers;

import com.example.MyFirstSpring.entity.Planet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import org.springframework.ui.Model;
import com.example.MyFirstSpring.repository.PlanetRepository;

@Controller
public class PlanetController {

    private final PlanetRepository planetRepository;

    @Autowired
    public PlanetController(PlanetRepository planetRepository) {
        this.planetRepository = planetRepository;
    }

    @GetMapping("/planets")
    public String showGalaxies(Model model) {
        List<Planet> planets = planetRepository.findAll();
        model.addAttribute("planets", planets);
        return "planet-list";
    }
}
