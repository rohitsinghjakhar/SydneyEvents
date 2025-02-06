package com.sydneyevents.sydney.scraper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import org.jsoup.select.Elements;

public class EventScraper {
    public static void main(String[] args) {
        try {
            // Connect to the page
            Document doc = Jsoup.connect("https://www.timeout.com/sydney/things-to-do").get();

            // Print the raw HTML to see its structure
            System.out.println(doc);

            // Look for the event cards, this might be different for your page
            Elements events = doc.select(".event-card");

            // Debug: Print how many events were found
            System.out.println("Found " + events.size() + " events.");

            // Loop through and print each event's details
            for (Element event : events) {
                String name = event.select(".event-title").text();
                String dateTime = event.select(".event-date").text();
                String location = event.select(".event-location").text();
                String description = event.select(".event-description").text();
                String ticketLink = event.select("a").attr("href");

                System.out.println("Event Name: " + name);
                System.out.println("Event Date/Time: " + dateTime);
                System.out.println("Location: " + location);
                System.out.println("Description: " + description);
                System.out.println("Ticket Link: " + ticketLink);
                System.out.println("---------------------------");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
