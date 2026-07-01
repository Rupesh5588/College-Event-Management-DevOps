package com.rupesh.collegeevent.service;

import com.rupesh.collegeevent.model.Event;
import com.rupesh.collegeevent.model.Registration;
import com.rupesh.collegeevent.model.Speaker;
import com.rupesh.collegeevent.repository.CollegeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollegeService {

    private final CollegeRepository repository;

    public CollegeService(CollegeRepository repository) {
        this.repository = repository;
    }

    public List<Event> getAllEvents() {
        return repository.getEvents();
    }

    public Event getEventById(int id) {

        for (Event event : repository.getEvents()) {
            if (event.getId() == id) {
                return event;
            }
        }

        return null;
    }

    public List<Speaker> getAllSpeakers() {
        return repository.getSpeakers();
    }

    public List<Registration> getAllRegistrations() {
        return repository.getRegistrations();
    }

    public void register(Registration registration) {
        repository.addRegistration(registration);
    }

}