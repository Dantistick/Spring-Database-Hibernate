package com.example.MyFirstSpring.Controllers;

import com.example.MyFirstSpring.entity.Galaxy;
import com.example.MyFirstSpring.entity.Planet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import org.springframework.ui.Model;
import com.example.MyFirstSpring.repository.PlanetRepository;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

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
        return "show/planet-list";
    }

    @GetMapping("/planets/add")
    public String showAddPlanetForm(Model model) {
        Planet newPlanet = new Planet();
        model.addAttribute("newPlanet", newPlanet);
        model.addAttribute("radiusPlanet", newPlanet.getRadiusPlanet());
        model.addAttribute("coreTemperature", newPlanet.getCoreTemperature());
//        model.addAttribute("isAtmosphere", newPlanet.isAtmosphere());
//        model.addAttribute("presenceOfLife", newPlanet.isPresenceOfLife());
        model.addAttribute("idGalaxy", newPlanet.getIdGalaxy());
        return "add/planet-add";
    }

    @ModelAttribute("newPlanet")
    public Planet getNewPlanet() {
        return new Planet();
    }

    @PostMapping("/planets/add")
    public String addPlanet(@ModelAttribute Planet planet) {
        planetRepository.save(planet);
        return "redirect:/planets";
    }
}
