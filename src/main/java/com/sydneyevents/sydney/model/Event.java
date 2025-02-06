package com.sydneyevents.sydney.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "events")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String dateTime;
    private String location;
    private String description;
    private String ticketLink;


    public Event(String sydneyOperaHouse, String s, String sydneyOperaHouse1, String s1, String url) {
    }
}
