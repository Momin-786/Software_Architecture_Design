package model.filter;
import domain.TransportationMode;
public class FlexibilityFilter implements Filter {
    @Override
    public void apply(TransportationMode mode) {
        System.out.println("Applying Flexibility Filter...");
        mode.calculateFlexibility();
        System.out.println("Flexibility Filter applied: Flexibility calculated as " + mode.getFlexibility());
    }
}
