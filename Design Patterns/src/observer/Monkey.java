package observer;

import java.util.ArrayList;
import java.util.List;

public class Monkey {

    private List<Observer> observers = new ArrayList<>();
    private String name;

    public Monkey(String name) {
        this.name = name;
    }

    public Monkey addEventObserver(Observer observer) {
        observers.add(observer);
        return this;
    }

    public String getName() {
        return name;
    }

    private void handleEvent(Event event) {
        for(Observer observer : observers) {
            observer.handleEvent(event);
        }
    }

    public void call() {
        Event event = new Event(this, "call");
        handleEvent(event);
    }

    public void run() {
        Event event = new Event(this, "run");
        handleEvent(event);
    }

}
