package com.example.LightControl.service;

import com.example.LightControl.entity.LightController;
import com.example.LightControl.repository.LightControllerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LightControllerService {

    @Autowired
    private LightControllerRepository repository;

    public LightController toggleLight(Long lightId, boolean status) {
        LightController light = repository.findById(lightId).orElseThrow(() -> new RuntimeException("Light not found"));
        light.toggleLight(status);
        return repository.save(light);
    }
}