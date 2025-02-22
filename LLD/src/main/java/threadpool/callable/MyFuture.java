package threadpool.callable;

public class MyFuture<V> implements IFuture {
    V v;

    public MyFuture(V v) {
        this.v = v;
    }

    @Override
    public String toString() {
        return "MyFuture{" +
                "v=" + v +
                '}';
    }
}
