package threads.wait_notify_join_deadlock_practice.wait_notify;

import java.util.LinkedList;
import java.util.Queue;

public class SharedResource {

    Queue<Integer> q = new LinkedList();
    int size = 10;

    public synchronized void produce() {
        if (q.size() == size) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        int x = 0;
        while (q.size() <= size) {
            System.out.println("adding by :" + Thread.currentThread().getName());
            q.add(x++);
        }
        notifyAll();
    }

    public synchronized void consume() {
        if (q.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        while (!q.isEmpty()) {
            System.out.println("consuming by :" + Thread.currentThread().getName());
            System.out.println("polling :" + q.poll());
        }

        notifyAll();
    }
}
