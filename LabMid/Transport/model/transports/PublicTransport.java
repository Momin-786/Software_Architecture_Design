package model.transports;

public class PublicTransport {
    private boolean restrictedFlexibility;
    private boolean payOnSpot;

    public PublicTransport(boolean restrictedFlexibility, boolean payOnSpot) {
        this.restrictedFlexibility = restrictedFlexibility;
        this.payOnSpot = payOnSpot;
    }

    public String getDetails() {
        return "Public Transport: Restricted Flexibility = " + restrictedFlexibility +
               ", Pay On Spot = " + payOnSpot;
    }
}
