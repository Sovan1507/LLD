package threadpool;

import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) {
        ExecutorService threadPoolExecutor = new ThreadPoolExecutor(2, 4, 10L
                , TimeUnit.MINUTES, new ArrayBlockingQueue<>(2), new MyThreadfactory(), new MyRejectHandler());


        for (int i = 0; i < 7; i++) {
            threadPoolExecutor.submit(() -> {
                try {
                    System.out.println("running by :" + Thread.currentThread().getName());
                    Thread.sleep(5000);
                } catch (Exception e) {

                }
            });
        }

        threadPoolExecutor.shutdown();
    }

}

class MyThreadfactory implements ThreadFactory {

    @Override
    public Thread newThread(Runnable r) {
        return new Thread(r);
    }
}

class MyRejectHandler implements RejectedExecutionHandler {

    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
        System.out.println("task rejected");
    }
}
