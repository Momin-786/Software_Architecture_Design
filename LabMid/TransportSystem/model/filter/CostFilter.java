package model.filter;
import domain.TransportationMode;
public class CostFilter implements Filter {
    @Override
    public void apply(TransportationMode mode) {
        System.out.println("Applying Cost Filter...");
        mode.calculateCost();
        System.out.println("Cost Filter applied: Cost calculated as " + mode.getCost());
    }
}
