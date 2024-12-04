package model;

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

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getEngineType() {
        return engineType;
    }

    public double getPrice() {
        return price;
    }
}
