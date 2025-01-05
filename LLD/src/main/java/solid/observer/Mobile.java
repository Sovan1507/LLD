package solid.observer;

public class Mobile implements Observer {

    String cellNo;

    public Mobile(String cellNo) {
        this.cellNo = cellNo;
    }

    @Override
    public void notifyy() {
        System.out.println("notifcation send to mobile:" + cellNo);
    }
}
