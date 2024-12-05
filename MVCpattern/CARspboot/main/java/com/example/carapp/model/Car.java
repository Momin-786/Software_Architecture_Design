package com.example.carapp.model;

public class Car {
    private String brand;
    private String model;
    private int year;
    private String color;
    private String engineType;
    private double price;


    public Car(String brand, String model, int year, String color, String engineType, double price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.engineType = engineType;
        this.price = price;
    }

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public String getEngineType() { return engineType; }
    public void setEngineType(String engineType) { this.engineType = engineType; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
}
