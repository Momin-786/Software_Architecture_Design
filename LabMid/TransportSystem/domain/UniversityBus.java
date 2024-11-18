package domain;
public class UniversityBus extends TransportationMode {

    public UniversityBus() {
        super("University Bus");
    }

    @Override
    public void calculateCost() {
        cost = 10.0; // Prepaid via challan
    }

    @Override
    public void calculateFlexibility() {
        flexibility = 5.0; // Moderate flexibility
    }
}
