package domain;
public class PublicTransport extends TransportationMode {

    public PublicTransport() {
        super("Public Transport");
    }

    @Override
    public void calculateCost() {
        cost = 20.0; // Simplified cost
    }

    @Override
    public void calculateFlexibility() {
        flexibility = 3.0; // Low flexibility
    }
}
