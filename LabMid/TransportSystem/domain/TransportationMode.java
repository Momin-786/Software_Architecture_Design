package domain;
public abstract class TransportationMode {
    protected String name;
    protected double cost;
    protected double flexibility; // 1-10 scale

    public TransportationMode(String name) {
        this.name = name;
    }

    public abstract void calculateCost();
    public abstract void calculateFlexibility();

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public double getFlexibility() {
        return flexibility;
    }
}
