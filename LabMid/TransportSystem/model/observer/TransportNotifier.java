package model.observer;
import java.util.ArrayList;
import java.util.List;

public class TransportNotifier {
    private final List<Observer> observers = new ArrayList<>();

    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String message) {
        System.out.println("Notifying observers...");
        for (Observer observer : observers) {
            observer.update(message);
            System.out.println("Notification sent to: " + observer.toString());
        }
        System.out.println("All observers notified.\n");
    }
    
}
