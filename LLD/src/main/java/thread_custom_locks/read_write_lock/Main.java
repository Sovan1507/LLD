package thread_custom_locks.read_write_lock;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Main {

    public static void main(String[] args) {
        ReadWriteLock lock = new ReentrantReadWriteLock();

        Thread t1 = new Thread(() -> {
            new DBrecord().readFromtable(lock);
        });
        Thread t2 = new Thread(() -> {
            new DBrecord().writeTotable(lock);
        });
        Thread t3 = new Thread(() -> {
            new DBrecord().readFromtable(lock);
        });
        Thread t4 = new Thread(() -> {
            new DBrecord().writeTotable(lock);
        });

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        System.out.println("finishing main thread");

    }
}
