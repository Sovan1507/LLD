package threadpool.callable;

import java.util.concurrent.Callable;

public interface IExecutorService {

    IFuture<?> submit(Runnable r);

    <V> IFuture<V> submit(Runnable r, V v);

    <V> IFuture<V> submit(Callable<V> c);

}
