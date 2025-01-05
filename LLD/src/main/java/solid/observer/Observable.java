package solid.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable {

    List<Observer> observers;
    int stock_size;

    public Observable() {
        this.observers = new ArrayList<>();
    }

    public void addStock(int n) {
        if (stock_size == 0) {
            stock_size = n;
            notifyy();
        }
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
}
