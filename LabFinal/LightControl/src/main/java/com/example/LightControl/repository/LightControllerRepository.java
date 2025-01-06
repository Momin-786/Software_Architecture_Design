package com.example.LightControl.repository;

import com.energysaving.controlservice.entity.*;
import com.example.LightControl.entity.LightController;
import com.example.LightControl.entity.LightEventController;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LightControllerRepository extends JpaRepository<LightController, Long> {

    Object findById(Long lightId);

    LightController save(LightEventController event);}
