package controller;

import model.Car;
import model.CarModel;
import view.CarView;

public class CarController {
    private CarModel model;
    private CarView view;

    public CarController(CarModel model, CarView view) {
        this.model = model;
        this.view = view;
    }

    public void setCarData(String brand, String model, int year, String color, String engineType, double price) {
        this.model.setCar(new Car(brand, model, year, color, engineType, price));
    }

    public void updateView() {
        Car car = model.getCar();
        view.printCarDetails(
            car.getBrand(), car.getModel(), car.getYear(),
            car.getColor(), car.getEngineType(), car.getPrice()
        );
    }
}
