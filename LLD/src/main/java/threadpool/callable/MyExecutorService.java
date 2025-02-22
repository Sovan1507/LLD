package threadpool.callable;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class MyExecutorService implements IExecutorService {

    List<Thread> threads = new ArrayList<>();
    Queue<Runnable> q = new ArrayBlockingQueue<>(5);

    public MyExecutorService(int x) {
        for (int i = 0; i < x; i++) {
            Thread t = new Thread(() -> {
                while (true) {
                    q.poll().run();
                }
            });
            t.start();
            threads.add(t);
        }
    }

    @Override
    public IFuture<?> submit(Runnable r) {
        MyFutureTask<Void> e = new MyFutureTask<>(r);
        q.add(e);
        while (!e.isDone()) {
        }
        return e.future;
    }

    @Override
    public <V> IFuture<V> submit(Runnable r, V v) {
        MyFutureTask<V> vMyFutureTask = new MyFutureTask<>(r, v);
        q.add(vMyFutureTask);
        while ()
    }

    @Override
    public <V> IFuture<V> submit(Callable<V> c) {
        return null;
    }
}
