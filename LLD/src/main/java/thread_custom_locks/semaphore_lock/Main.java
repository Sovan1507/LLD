package thread_custom_locks.semaphore_lock;

import java.util.concurrent.Semaphore;

public class Main {

    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(2);

        Thread t1 = new Thread(() -> {
            new SharedResource().process(semaphore, 1);
        });
        Thread t2 = new Thread(() -> {
            new SharedResource().process(semaphore, 2);
        });
        Thread t3 = new Thread(() -> {
            new SharedResource().process(semaphore, 3);
        });
        Thread t4 = new Thread(() -> {
            new SharedResource().process(semaphore, 4);
        });

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        System.out.println("main finishing");
    }
}
