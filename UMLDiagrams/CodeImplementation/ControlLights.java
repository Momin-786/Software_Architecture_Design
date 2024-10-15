// 1. Controller: HomeAutomationSystem manages the light control flow
class HomeAutomationSystem {
    private LightController lightCtrl;

    public HomeAutomationSystem() {
        lightCtrl = new LightController();
    }

    public void controlLights(boolean turnOn) {
        // 2. Information Expert: LightController knows how to manage light status
        if (turnOn) {
            lightCtrl.setStatus(true);  // Turn lights ON
            System.out.println("Lights turned ON.");
        } else {
            lightCtrl.setStatus(false);  // Turn lights OFF
            System.out.println("Lights turned OFF.");
        }
    }

    public void checkLightStatus() {
        if (lightCtrl.getStatus()) {
            System.out.println("The lights are currently ON.");
        } else {
            System.out.println("The lights are currently OFF.");
        }
    }
}

// 2. Information Expert: LightController knows how to manage light status
class LightController {
    private boolean status;  // false = OFF, true = ON

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}

// 3. Low Coupling: User class is independent of the LightController
class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}

// Main class demonstrating light control
public class ControlLights {
    public static void main(String[] args) {
        // Create a new user
        User user = new User("admin", "1234");
        
        // 4. Indirection: HomeAutomationSystem controls the interaction between User and LightController
        HomeAutomationSystem system = new HomeAutomationSystem();
        
        // Check current light status
        system.checkLightStatus();
        
        // User decides to turn the lights ON
        system.controlLights(true);
        
        // Check light status again
        system.checkLightStatus();
    }
}
