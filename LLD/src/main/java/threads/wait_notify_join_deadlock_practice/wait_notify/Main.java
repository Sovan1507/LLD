package threads.wait_notify_join_deadlock_practice.wait_notify;

public class Main {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();
        Thread p1 = new Thread(() -> {
            sharedResource.produce();
        });
        Thread p2 = new Thread(() -> {
            sharedResource.produce();
        });
        Thread c1 = new Thread(() -> {
            sharedResource.consume();
        });
        Thread c2 = new Thread(() -> {
            sharedResource.consume();
        });

        p1.start();
        p2.start();
        c1.start();
        c2.start();
    }
}
