package com.example.carapp.controller;

import com.example.carapp.model.Car;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/car")
public class CarController {

    @GetMapping("/details")
    public Car getCarDetails() {
        return new Car("Tesla", "Model S", 2022, "Red", "Electric", 79999.99);
    }
}
