package com.example.User.controller;

import com.example.User.entity.EmailAlert;
import com.example.User.service.EmailAlertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/email-alerts")
public class EmailAlertController {

    @Autowired
    private EmailAlertService service;

    @PostMapping
    public EmailAlert sendEmail(@RequestBody EmailAlert alert) {
        return service.sendAlert(alert);
    }
}