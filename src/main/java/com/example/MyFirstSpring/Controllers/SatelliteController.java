package com.example.MyFirstSpring.Controllers;

import com.example.MyFirstSpring.entity.Satellite;
import com.example.MyFirstSpring.repository.SatelliteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;;

@Controller
public class SatelliteController {

    private final SatelliteRepository satelliteRepository;

    @Autowired
    public SatelliteController(SatelliteRepository satelliteRepository) {
        this.satelliteRepository = satelliteRepository;
    }

    @GetMapping("/satellites")
    public String showSatellites(Model model) {
        List<Satellite> satellites = satelliteRepository.findAll();
        model.addAttribute("satellites", satellites);
        return "show/satellite-list";
    }

    @GetMapping("/satellites/add")
    public String showAddSatelliteForm(Model model) {
        Satellite newSatellite = new Satellite();
        model.addAttribute("newSatellite", newSatellite);
        // Add any other attributes related to Satellite if needed
        return "add/satellite-add";
    }

    @PostMapping("/satellites/add")
    public String addSatellite(@ModelAttribute Satellite satellite) {
        satelliteRepository.save(satellite);
        return "redirect:/satellites";
    }
}