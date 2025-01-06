package com.example.LightControl.controller;

import com.example.LightControl.entity.LightController;
import com.example.LightControl.service.LightControllerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/lights")
public class LightControllerController {

    @Autowired
    private LightControllerService service;

    @PutMapping("/{id}/toggle")
    public LightController toggleLight(@PathVariable Long id, @RequestParam boolean status) {
        return service.toggleLight(id, status);
    }
}