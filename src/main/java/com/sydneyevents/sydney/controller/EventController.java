package com.sydneyevents.sydney.controller;



import com.sydneyevents.sydney.model.Event;
import com.sydneyevents.sydney.repo.EventRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000") // Here we will Allow React frontend using CrossOrigin Annotation.
@RestController
@RequestMapping("/api")
public class EventController {

    // Endpoint to save email (you can also send confirmation email or store it in a database)
    @PostMapping("/saveEmail")
    public String saveEmail(@RequestBody EmailRequest emailRequest) {
        // For now, we are just logging the email
        System.out.println("Received email: " + emailRequest.getEmail());

        // Here, you would save the email to your database or call an email API service

        return "Email submitted successfully!";
    }

    // A class to map the email request
    public static class EmailRequest {
        private String email;

        // Getter and setter
        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }
    }
}
