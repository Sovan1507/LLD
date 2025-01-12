package solid.observer_design_pattern.observer;

import solid.observer_design_pattern.obervable.Observable;

public class Email implements Observer {

    private final Observable obj;
    String id;

    public Email(String id, Observable obj) {
        this.id = id;
        this.obj = obj;
    }

    @Override
    public void notifyy() {
        System.out.println("notification sent to mail:" + id + " for product: " + obj.getName());
    }
}
