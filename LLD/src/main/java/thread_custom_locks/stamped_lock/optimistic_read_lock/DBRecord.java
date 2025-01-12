package thread_custom_locks.stamped_lock.optimistic_read_lock;

import java.util.concurrent.locks.StampedLock;

public class DBRecord {

    StampedLock lock = new StampedLock();

    public void read() {
        long stamp = lock.tryOptimisticRead(); // this will not acquire any lock. since optimistic locking does not need locking. rather it works by versioning
        try {
            Thread.sleep(5000);
            if (lock.validate(stamp)) { // by the time it sleeps, the other thread gets the write lock and update the stanp of the lock
                System.out.println("write is successfull");
            } else {
                System.out.println("rolling back ..  someone else might have changed the value");
            }

        } catch (Exception e) {

        }
    }

    public void write() {
        long stamp = lock.writeLock();

        System.out.println("changing the stamp");

        lock.unlockWrite(stamp);
    }
}
