package com.company;

import java.util.Date;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class Main {


    static long numOfOperations = 10_000_000_000L;

    static int numOfThreads = Runtime.getRuntime().availableProcessors();

    public static void main(String[] args) throws Exception {
        System.out.println(new Date());
        ForkJoinPool pool = new ForkJoinPool(numOfThreads);
        System.out.println(pool.invoke(new MyFork(0L, numOfOperations)));
        System.out.println(new Date());
    }

    static class MyFork extends RecursiveTask<Long> {
        long from, to;

        public MyFork(long l, long numOfOperations) {
            this.from = from;
            this.to = to;
        }

        @Override
        protected Long compute() {

            if ((to - from) <= numOfOperations) {
                long j = 0;
                for (long i = from; i < to; i++) {
                    j += i;
                }
                return j;
            } else {
                long middle = (to + from) / 2;
                MyFork firsHalf = new MyFork(from, middle);
                firsHalf.fork();
                MyFork secondHalf = new MyFork(middle + 1, to);
                long secondValue = secondHalf.compute();
                return firsHalf.join() + secondValue;
            }
        }
    }
}
