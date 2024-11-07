package dal;

import java.util.ArrayList;
import java.util.List;
import model.Light;

public class LightRepository {

    private List<Light> lights;

    public List<Light> getAllLights() {
        return new ArrayList<>(lights);
    }

    public void addLight(Light light) {
        lights.add(light);
    }

    public Light findLightByName(String name) {
        for (Light light : lights) {
            if (light.toString().equals(name)) {
                return light;
            }
        }
        return null; // Return null if no match found
    }

    public void updateLight(Light light) {
  
    }
    public LightRepository() {
        this.lights = new ArrayList<>();
        lights.add(new Light("Front room"));
        lights.add(new Light("Back room"));
        lights.add(new Light("Bedroom"));
        lights.add(new Light("Bathroom"));
    }
}
