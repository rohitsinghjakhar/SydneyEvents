package com.sydneyevents.sydney.service;


import com.sydneyevents.sydney.model.Event;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EventService {

    // In a real application, you would fetch these from a database or use scraped data
    public List<Event> getAllEvents() {
        List<Event> events = new ArrayList<>();

        // Static list for now, replace with DB fetch or scraping logic
        events.add(new Event(
                "Sydney Opera House",
                "2025-02-10 19:00",
                "Sydney Opera House",
                "An amazing opera performance at the iconic Sydney Opera House",
                "https://www.sydneyoperahouse.com"
        ));

        events.add(new Event(
                "Sydney Festival",
                "2025-02-12 14:00",
                "Hyde Park",
                "Annual Sydney Festival with lots of fun events",
                "https://www.sydneyfestival.org.au"
        ));

        events.add(new Event(
                "Vivid Sydney",
                "2025-06-01 18:00",
                "Circular Quay",
                "Vivid Sydney Festival, lights, music, and ideas.",
                "https://www.vividsydney.com"
        ));

        events.add(new Event(
                "Bondi Beach Party",
                "2025-03-14 20:00",
                "Bondi Beach",
                "Join the beach party with music, food, and fun vibes",
                "https://www.bondibeachparty.com"
        ));

        return events;
    }

    // Add more methods to interact with database if needed
    // For example, fetching events by date, location, etc.
}
