package thread_custom_locks.stamped_lock.optimistic_read_lock;

public class Main {

    public static void main(String[] args) {
        DBRecord dbRecord = new DBRecord();

        Thread t1 = new Thread(() -> {
            dbRecord.read();
        });
        Thread t2 = new Thread(() -> {
            dbRecord.write();
        });

        t1.start();
        t2.start();

        System.out.println("finishing main thread");
    }
}
