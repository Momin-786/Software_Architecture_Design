package com.example.User.controller;

import com.example.User.entity.EventHandler;
import com.example.User.service.EventHandlerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/event-handlers")
public class EventHandlerController {

    @Autowired
    private EventHandlerService service;

    @PostMapping
    public EventHandler handleEvent(@RequestBody EventHandler handler) {
        return service.handleEvent(handler);
    }
}