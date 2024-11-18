package model;

import model.filters.Filter;
import java.util.List;

public class NotificationPipe {
    private List<Filter> filters;

    public void setFilters(List<Filter> filters) {
        this.filters = filters;
    }

    public String process(String notification) {
        for (Filter filter : filters) {
            notification = filter.process(notification);
        }
        return notification;
    }
}
