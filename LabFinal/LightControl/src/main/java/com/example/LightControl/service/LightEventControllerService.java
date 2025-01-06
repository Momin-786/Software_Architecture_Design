package com.example.LightControl.service;

import com.example.LightControl.entity.LightEventController;
import com.example.LightControl.repository.LightControllerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LightEventControllerService {

    @Autowired
    private LightControllerRepository repository;

    public LightEventController processLightEvent(LightEventController event) {
        return repository.save(event);
    }
}