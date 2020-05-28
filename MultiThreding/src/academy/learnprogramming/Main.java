package academy.learnprogramming;

import HomeWork.Age;
import HomeWork.CallableTwo;
import HomeWork.RunnableTwo;

import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) {
        Counter counter = new Counter();

        NewThread newThread = new NewThread("Thread-1", counter);

        newThread.start();

//        try {
////            newThread.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        for(int i = 0; i < 10; i++) {
//            new Thread(new NewRunnable(counter), "Thread-" + i).start();
//        }
        Thread thread = new Thread(new NewRunnable(counter), "Thread-2");
        thread.start();

        NewCallable newcollable = new NewCallable(1234);
        FutureTask task = new FutureTask(newcollable);
        Thread thread = new Thread(task);
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            Integer result = (Integer) task.get();
            System.out.println(result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

//        Executor executor = Executors.newSingleThreadExecutor();
//        executor.execute(() -> System.out.println("Hello World"));
//
//        executor.execute(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Hello World");
//
//            }
//        });
//
//        executor.execute(new RunnableTwo(new Age()));
//        // Executor и ExecutorService альеотрнативный способ запуска потоков
//        ExecutorService executor1 = Executors.newFixedThreadPool(5);
//        Future<Integer> integerFuture = executor1.submit(new CallableTwo(1983));
//        try {
//            System.out.println(integerFuture.get());
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } catch (ExecutionException e) {
//            e.printStackTrace();
//        }
//
//        ThreadPoolExecutor executor3 = (ThreadPoolExecutor) Executors.newCachedThreadPool();
//        executor3.submit(new CallableTwo(1983));
//        executor3.submit(() -> {
//            System.out.println("Runnable");
//        });
//        executor3.submit(() -> {
//            System.out.println("Runnable NEW");
//
//        });

    }
}
