package service;

import java.util.ArrayList;
import java.util.List;
import model.House;
import model.Light;

public class HouseService {

    private House house;

    public HouseService() {
        initializeHouse();
    }

    public House getHouse() {
        return house;
    }

    public void turnOnLight(String lightName) {
        for (Light light : house.getLights()) {
            if (((String) light.getName()).equalsIgnoreCase(lightName)) {
                light.turnOn();
            }
        }
    }

    public void turnOffLight(String lightName) {
        for (Light light : house.getLights()) {
            if (((String) light.getName()).equalsIgnoreCase(lightName)) {
                light.turnOff();
            }
        }
    }

    public void setDimValue(String lightName, int dimValue) {
        for (Light light : house.getLights()) {
            if (((String) light.getName()).equalsIgnoreCase(lightName)) {
                light.setDimValue(dimValue);
            }
        }
    }

    public List<Light> getAllLights() {
        return house.getLights();
 
    }
    private void initializeHouse() {
        List<Light> lights = new ArrayList<>();
        lights.add(new Light("Front room"));
        lights.add(new Light("Back room"));
        lights.add(new Light("Bedroom"));
        lights.add(new Light("Bathroom"));
        house = new House();
    }
}

