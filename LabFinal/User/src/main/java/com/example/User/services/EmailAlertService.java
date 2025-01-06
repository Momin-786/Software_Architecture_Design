package com.example.User.services;

import com.energysaving.userservice.entity.EmailAlert;
import com.energysaving.userservice.repository.EmailAlertRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailAlertService {

    @Autowired
    private EmailAlertRepository repository;

    public EmailAlert sendAlert(EmailAlert alert) {
        return repository.save(alert);
    }
}