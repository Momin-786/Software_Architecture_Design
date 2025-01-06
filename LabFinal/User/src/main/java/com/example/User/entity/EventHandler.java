package com.example.User.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EventHandler {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long handlerId;

    public void handleEvent(String event) {
        System.out.println("Handling event: " + event);
    }

    public void logEvent(String event) {
        System.out.println("Logging event: " + event);
    }
}