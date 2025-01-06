package com.example.LightControl.controller;

import com.example.LightControl.entity.LightEventController;
import com.example.LightControl.service.LightEventControllerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/light-events")
public class LightEventControllerController {

    @Autowired
    private LightEventControllerService service;

    @PostMapping
    public LightEventController processLightEvent(@RequestBody LightEventController event) {
        return service.processLightEvent(event);
    }
}
