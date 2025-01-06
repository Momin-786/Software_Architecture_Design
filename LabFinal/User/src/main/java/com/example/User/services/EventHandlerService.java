package com.example.User.services;

import com.energysaving.userservice.entity.EventHandler;
import com.energysaving.userservice.repository.EventHandlerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventHandlerService {

    @Autowired
    private EventHandlerRepository repository;

    public EventHandler handleEvent(EventHandler handler) {
        return repository.save(handler);
    }
}