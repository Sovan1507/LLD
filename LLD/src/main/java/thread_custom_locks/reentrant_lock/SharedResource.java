package thread_custom_locks.reentrant_lock;

import java.util.concurrent.locks.Lock;

public class SharedResource {

    public void produce(Lock lock) {
        try {
            lock.lock(); // here if the lock is taken by another thread, the current thread will wait till the lock is free
            System.out.println("Got the lock: " + Thread.currentThread().getName());
            Thread.sleep(5000);
        } catch (
                Exception e) {
        } finally {
            lock.unlock();
            System.out.println("releasing lock by:" + Thread.currentThread().getName());
        }

    }
}
