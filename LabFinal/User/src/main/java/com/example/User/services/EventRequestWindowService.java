package com.example.User.services;

import com.energysaving.userservice.entity.EventRequestWindow;
import com.energysaving.userservice.repository.EventRequestWindowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventRequestWindowService {

    @Autowired
    private EventRequestWindowRepository repository;

    public EventRequestWindow createEventRequest(EventRequestWindow request) {
        return repository.save(request);
    }
}