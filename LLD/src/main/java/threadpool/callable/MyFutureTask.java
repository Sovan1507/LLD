package threadpool.callable;

import java.util.concurrent.Callable;

public class MyFutureTask<V> implements Runnable {

    IFuture<V> future;
    Runnable r;
    Callable c;
    boolean done = true;

    public MyFutureTask(Runnable r) {
        this.r = r;
        new 
    }

    public MyFutureTask(Runnable r, V v) {
        this.r = r;
        future = new MyFuture<>(v);
    }

    public MyFutureTask(Callable<V> r) {
        this.c = r;
    }

    public boolean isDone() {
        return done;
    }

    @Override
    public void run() {
        try {
            if (r == null) {
                r.run();
                if ()

            } else {
                future = new MyFuture<>(c.call());
            }
        } catch (Exception e) {

        } finally {
            done = true;
        }
    }
}
