package controller;

import service.HouseService;
import model.Light;

import java.util.List;

public class HouseController {

    private HouseService houseService;

    public HouseController() {
        houseService = new HouseService();
    }

    public List<Light> getLights() {
        return houseService.getAllLights();
    }

    public void turnOnLight(String lightName) {
        houseService.turnOnLight(lightName);
    }

    public void turnOffLight(String lightName) {
        houseService.turnOffLight(lightName);
    }

    public void setLightDimValue(String lightName, int dimValue) {
        houseService.setDimValue(lightName, dimValue);
    }
}
