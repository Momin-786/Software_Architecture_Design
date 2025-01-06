package com.example.LightControl.repository;

import com.example.LightControl.entity.HomeAutomationSystem;

public interface HomeAutomationSystemRepository extends JpaRepository<HomeAutomationSystem, Long> {

    HomeAutomationSystem save(HomeAutomationSystem system);}

