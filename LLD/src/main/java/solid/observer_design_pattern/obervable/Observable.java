package solid.observer_design_pattern.obervable;

import solid.observer_design_pattern.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable {

    List<Observer> observers;

    public Observable() {
        this.observers = new ArrayList<>();
    }

    public void updateData() {
        notifyy();
    }

    public void notifyy() {
        observers.forEach(observer -> observer.notifyy());
    }

    public void addObserver(Observer o) {
        observers.add(o);
    }

    public void deleteObserver(Observer o) {
        observers.remove(o);
    }

    public abstract String getName();

}
