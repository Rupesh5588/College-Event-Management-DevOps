package com.rupesh.collegeevent.repository;

import com.rupesh.collegeevent.model.Event;
import com.rupesh.collegeevent.model.Registration;
import com.rupesh.collegeevent.model.Speaker;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CollegeRepository {

    private final List<Event> events = new ArrayList<>();
    private final List<Speaker> speakers = new ArrayList<>();
    private final List<Registration> registrations = new ArrayList<>();

    public CollegeRepository() {

        events.add(new Event(1,
                "Hackathon 2026",
                "15 July 2026",
                "09:00 AM",
                "Auditorium",
                "24-hour coding competition"));

        events.add(new Event(2,
                "AI Workshop",
                "16 July 2026",
                "10:00 AM",
                "Seminar Hall",
                "Hands-on Artificial Intelligence Workshop"));

        events.add(new Event(3,
                "Project Expo",
                "17 July 2026",
                "11:00 AM",
                "Main Block",
                "Final year project exhibition"));



        speakers.add(new Speaker(
                1,
                "Dr. Ramesh Kumar",
                "AI Research Scientist",
                "Future of Artificial Intelligence"));

        speakers.add(new Speaker(
                2,
                "Mrs. Priya Sharma",
                "Cloud Engineer",
                "Cloud Computing with AWS"));

    }

    public List<Event> getEvents() {
        return events;
    }

    public List<Speaker> getSpeakers() {
        return speakers;
    }

    public List<Registration> getRegistrations() {
        return registrations;
    }

    public void addRegistration(Registration registration) {
        registrations.add(registration);
    }

}