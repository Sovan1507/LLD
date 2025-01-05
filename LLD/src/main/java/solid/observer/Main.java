package solid.observer;

public class Main {

    public static void main(String[] args) {

        Observer email_observer = new Email("abc@test.com");
        Observer cell_observer = new Mobile("123456789");

        Observable tv_observable = new TV();
        tv_observable.addObserver(email_observer);
        Observable cell_observable = new CellPhone();
        cell_observable.addObserver(cell_observer);

        ///  here the notify should be triggered when the stock is added
        tv_observable.notifyy();
        cell_observable.notifyy();
    }
}
