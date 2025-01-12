package thread_custom_locks.semaphore_lock;

import java.util.concurrent.Semaphore;

public class SharedResource {

    public void process(Semaphore lock, int x) {
        try {
            lock.acquire();
            System.out.println("lock acquired by :" + Thread.currentThread().getName());
            Thread.sleep(x * 5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.release();
            System.out.println("lock released by :" + Thread.currentThread().getName());
        }
    }

}
