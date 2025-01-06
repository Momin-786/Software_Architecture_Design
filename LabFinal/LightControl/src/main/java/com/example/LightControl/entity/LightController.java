package com.example.LightControl.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LightController {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long lightId;

    private boolean status;

    public boolean checkAvailability() {
        return true; // Example logic
    }

    public void toggleLight(boolean status) {
        this.status = status;
    }
}