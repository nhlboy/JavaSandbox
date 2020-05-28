package executors.homework;

import java.util.concurrent.*;

public class Day {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

////        DayThread newDay = new DayThread();
////        newDay.start();
//
//
//        Executor executor = Executors.newCachedThreadPool();
//        executor.execute(new DayThread());
//
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        Future<Integer> future = executorService.submit(new DayCollable());
        executorService.shutdown();
        System.out.println(future.get());

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 2,
                100L, TimeUnit.SECONDS, new SynchronousQueue());
        Callable<String> task = () -> Thread.currentThread().getName();
        threadPoolExecutor.setRejectedExecutionHandler((runnable, executor) -> System.out.println("Rejected"));
        for (int i = 0; i < 5; i++) {
            threadPoolExecutor.submit(task);
        }
////
////        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
////        executor.submit(() -> {
////            Thread.sleep(1000);
////            System.out.println(Thread.currentThread().getName());
////            return null;
////        });
////        executor.submit(() -> {
////            System.out.println(Thread.currentThread().getName());
////            Thread.sleep(1000);
////            return null;
////        });
////        executor.submit(() -> {
////            System.out.println(Thread.currentThread().getName());
////            Thread.sleep(1000);
////            return null;
////        });
//
//
//
////        threadPoolExecutor.shutdown();
//
//
////        ScheduledExecutorService executor = Executors.newScheduledThreadPool(5);
////        FutureTask<Integer> futureTask = new FutureTask<Integer>(new DayCollable());
////        executor.execute(futureTask);
////        executor.shutdown();
////        System.out.println(futureTask.get());
////
//////        executor.schedule(() -> {
//////            System.out.println("Hello World");
//////
//////        }, 500, TimeUnit.MILLISECONDS);
////
////        executor.scheduleAtFixedRate(() -> {
////            System.out.println("Hello World");
////
////        }, 5000, 1000, TimeUnit.MILLISECONDS);
    }



}



