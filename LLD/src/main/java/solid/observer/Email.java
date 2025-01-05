package solid.observer;

public class Email implements Observer {

    String id;

    public Email(String id) {
        this.id = id;
    }

    @Override
    public void notifyy() {
        System.out.println("notification sent to mail:" + id);
    }
}
