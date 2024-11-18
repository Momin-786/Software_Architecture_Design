package domain;
public class PersonalVehicle extends TransportationMode {

    public PersonalVehicle() {
        super("Personal Vehicle");
    }

    @Override
    public void calculateCost() {
        cost = 50.0; // Simplified cost for fuel/maintenance
    }

    @Override
    public void calculateFlexibility() {
        flexibility = 8.0; // High flexibility
    }
}
