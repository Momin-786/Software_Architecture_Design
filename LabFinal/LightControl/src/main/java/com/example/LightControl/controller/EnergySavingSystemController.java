package com.example.LightControl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/home-automation")
public class EnergySavingSystemController {

    @Autowired
    private HomeAutomationSystemService service;

    @PostMapping("/send-alert")
    public HomeAutomationSystem sendAlert(@RequestBody HomeAutomationSystem system) {
        return service.sendAlert(system);
    }
}
