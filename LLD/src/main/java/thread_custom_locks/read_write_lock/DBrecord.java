package thread_custom_locks.read_write_lock;

import java.util.concurrent.locks.ReadWriteLock;

public class DBrecord {

    public void readFromtable(ReadWriteLock lock) {
        try {
            lock.readLock().lock();
            System.out.println("read lock taken by :" + Thread.currentThread().getName());
            Thread.sleep(5000);
        } catch (Exception e) {

        } finally {
            lock.readLock().unlock();
            System.out.println("read lock released by :" + Thread.currentThread().getName());
        }
    }

    public void writeTotable(ReadWriteLock lock) {
        try {
            lock.writeLock().lock();
            System.out.println("Write lock acquired by: " + Thread.currentThread().getName());
            Thread.sleep(5000 );
        } catch (Exception e) {

        } finally {
            lock.writeLock().unlock();
            System.out.println("write lock released by :" + Thread.currentThread().getName());
        }
    }
}
