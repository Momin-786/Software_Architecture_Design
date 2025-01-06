package com.example.LightControl.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LightEventController {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long eventId;

    @ManyToOne
    private LightController lightController;

    public void processLightEvent() {
        System.out.println("Processing light event");
    }

    public void updateLightStatus(boolean status) {
        lightController.toggleLight(status);
    }
}