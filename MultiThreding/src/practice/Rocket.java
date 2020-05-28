package practice;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Rocket {
    public static void main(String[] args) {

//        Executor executor = Executors.newCachedThreadPool();
//        executor.execute(new CountdownThread());

        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Future<Integer> future = executorService.submit(new RocketCall());
        executorService.shutdown();

    }

}


