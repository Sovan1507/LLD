package threads.wait_notify_join_deadlock_practice.deadlock;

public class Main {

    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();
        Thread t1 = new Thread(() -> {
            sharedResource.process();
        });
        Thread t2 = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            sharedResource.process();
        });


        //T1 (since t2 is sleeping) wil get into the synchronized block and acquires the lock and will get suspended
        // that means the T1 will be blocked but will not release the lock.
        // So when T2 tried to enter the block it wont be ale to since the lock was not released by T1
        // this will cause deadlock
        t1.start();
        t2.start();
    }
}
