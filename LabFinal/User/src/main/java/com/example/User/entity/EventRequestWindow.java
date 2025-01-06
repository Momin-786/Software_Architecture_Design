package com.example.User.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EventRequestWindow {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long windowId;

    private String message;

    public void displayMessage(String message) {
        System.out.println("Displaying message: " + message);
    }
}
