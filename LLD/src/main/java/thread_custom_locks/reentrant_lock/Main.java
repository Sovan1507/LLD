package thread_custom_locks.reentrant_lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {


        Lock lock = new ReentrantLock();

        Thread t1 = new Thread(() -> {
            new SharedResource().produce(lock);
        });
        Thread t2 = new Thread(() -> {
            new SharedResource().produce(lock);
        });

        t1.start();
        t2.start();

        System.out.println("Main thread finishing");
    }
}
