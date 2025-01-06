package com.example.User.repository;

import com.example.User.userservice.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailAlertRepository extends JpaRepository<EmailAlert, Long> {}
