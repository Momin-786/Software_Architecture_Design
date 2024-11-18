package model.filter;
import domain.TransportationMode;
public interface Filter {
    void apply(TransportationMode mode);
}
