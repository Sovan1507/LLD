package solid.observer_design_pattern.observer;

import solid.observer_design_pattern.obervable.Observable;

public class Mobile implements Observer {

    private final Observable obj;
    String cellNo;

    public Mobile(String cellNo, Observable obj) {
        this.cellNo = cellNo;
        this.obj = obj;
    }

    @Override
    public void notifyy() {
        System.out.println("For notifcation send to mobile:" + cellNo + " for product: " + obj.getName());
    }
}
