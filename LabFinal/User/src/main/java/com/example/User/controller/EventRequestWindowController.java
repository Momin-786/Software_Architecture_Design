package com.example.User.controller;

import com.example.User.entity.EventRequestWindow;
import com.example.User.service.EventRequestWindowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/event-requests")
public class EventRequestWindowController {

    @Autowired
    private EventRequestWindowService service;

    @PostMapping
    public EventRequestWindow createRequest(@RequestBody EventRequestWindow request) {
        return service.createEventRequest(request);
    }
}