package com.example.demo.controllers;

import com.example.demo.models.Flight;
import com.example.demo.services.FlightService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import java.util.List;

@Controller
public class FlightController {

    private static final Logger log = LoggerFactory.getLogger(FlightController.class);
    @Autowired
    private FlightService flightService;

    @GetMapping("/flights")
    public String getFlights(Model model) {
        log.info("Getting all flights");
        try {
            List<Flight> flights = flightService.getAllFlights();
            model.addAttribute("flights", flights);
            return "flights";
        } catch (Exception ex) {
            log.error("An error occurred while getting all flights", ex);
            model.addAttribute("error", ex.getMessage());
            return "error";
        }
    }
}
