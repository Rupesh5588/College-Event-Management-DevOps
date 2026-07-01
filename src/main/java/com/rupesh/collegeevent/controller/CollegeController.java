package com.rupesh.collegeevent.controller;

import com.rupesh.collegeevent.model.Event;
import com.rupesh.collegeevent.model.Registration;
import com.rupesh.collegeevent.model.Speaker;
import com.rupesh.collegeevent.service.CollegeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class CollegeController {

    private final CollegeService service;

    public CollegeController(CollegeService service) {
        this.service = service;
    }

    @GetMapping("/events")
    public List<Event> getAllEvents() {
        return service.getAllEvents();
    }

    @GetMapping("/events/{id}")
    public Event getEventById(@PathVariable int id) {
        return service.getEventById(id);
    }

    @GetMapping("/speakers")
    public List<Speaker> getAllSpeakers() {
        return service.getAllSpeakers();
    }

    @GetMapping("/registrations")
    public List<Registration> getAllRegistrations() {
        return service.getAllRegistrations();
    }

    @PostMapping("/register")
    public String register(@RequestBody Registration registration) {

        registration.setId(service.getAllRegistrations().size() + 1);

        service.register(registration);

        return "Registration Successful";
    }

    @GetMapping("/health")
    public String health() {
        return "Application is Running Successfully";
    }

}