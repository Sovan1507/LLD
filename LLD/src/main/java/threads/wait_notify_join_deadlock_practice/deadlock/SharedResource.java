package threads.wait_notify_join_deadlock_practice.deadlock;

public class SharedResource {


    public synchronized void process() {
        System.out.println("lock got by :" + Thread.currentThread().getName());
        //here the thread will be suspended after acquiring the lock
        // because suspend() is called on the thread. the lcok will not be released
        // so no other tread will be able to enter into this synchronized block
        Thread.currentThread().suspend();
    }
}
