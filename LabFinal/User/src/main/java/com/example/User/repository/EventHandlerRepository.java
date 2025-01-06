package com.example.User.repository;

import com.example.User.userservice.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventHandlerRepository extends JpaRepository<EventHandler, Long> {}

