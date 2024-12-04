package view;

public class CarView {
    public void printCarDetails(String brand, String model, int year, String color, String engineType, double price) {
        System.out.println("Car Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
        System.out.println("Engine Type: " + engineType);
        System.out.println("Price: $" + price);
    }
}
