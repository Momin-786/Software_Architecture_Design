package model.filter;
import java.util.ArrayList;
import domain.TransportationMode;
import java.util.List;

public class Pipe {
    private final List<Filter> filters = new ArrayList<>();

    public void addFilter(Filter filter) {
        filters.add(filter);
    }

    public void process(TransportationMode mode) {
        System.out.println("Starting pipeline processing...");
        for (Filter filter : filters) {
            filter.apply(mode);
        }
        System.out.println("Pipeline processing complete.\n");
    }
}

