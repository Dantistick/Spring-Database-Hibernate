package com.example.MyFirstSpring.Controllers;

import com.example.MyFirstSpring.entity.Galaxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import com.example.MyFirstSpring.repository.GalaxyRepository;
import org.springframework.ui.Model;

@Controller
public class GalaxyController {

    private final GalaxyRepository galaxyRepository;

    @Autowired
    public GalaxyController(GalaxyRepository galaxyRepository) {
        this.galaxyRepository = galaxyRepository;
    }

    @GetMapping("/galaxies")
    public String showGalaxies(Model model) {
        List<Galaxy> galaxies = galaxyRepository.findAll();
        model.addAttribute("galaxies", galaxies);
        return "galaxy-list";
    }
}
