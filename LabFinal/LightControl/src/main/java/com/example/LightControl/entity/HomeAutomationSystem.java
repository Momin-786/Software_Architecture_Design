package com.example.LightControl.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class HomeAutomationSystem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long systemId;

    private String location;

    public void requestControl() {
        System.out.println("Requesting control of system");
    }

    public void confirmStatusChange() {
        System.out.println("Confirming status change");
    }

    public void sendAlert() {
        System.out.println("Sending alert");
    }
}