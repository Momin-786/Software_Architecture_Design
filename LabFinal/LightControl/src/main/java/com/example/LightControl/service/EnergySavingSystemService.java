package com.example.LightControl.service;

import com.example.LightControl.entity.HomeAutomationSystem;
import com.example.LightControl.repository.HomeAutomationSystemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnergySavingSystemService {

    @Autowired
    private HomeAutomationSystemRepository repository;

    public HomeAutomationSystem sendAlert(HomeAutomationSystem system) {
        return repository.save(system);
    }
}