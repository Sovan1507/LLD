package threads.wait_notify_join_deadlock_practice.daemon;

public class Main {
    public static void main(String[] args) {

        // user thread
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(i * 1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("T1 finishing");
        });
        // user thread
        Thread dt = new Thread(() -> {
            while (true) {
                try {
                    System.out.println("---- daemon running-----");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        dt.setDaemon(true);

        dt.start();
        t1.start();

        System.out.println("finishing main thread");

    }
}
