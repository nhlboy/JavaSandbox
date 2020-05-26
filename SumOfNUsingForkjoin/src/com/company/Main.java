package com.company;

import java.util.Date;
import java.util.concurrent.ForkJoinPool;

public class Main {

    static long numOfOperations = 10_000_000_000L;

    static int numOfThreads = Runtime.getRuntime().availableProcessors();

    public static void main(String[] args) throws Exception {
        System.out.println(numOfOperations);
        System.out.println(new Date());
//	long j = 0;
//	for(long i = 0; i < numOfOperations; i++) {
//	    j +=i;
//    }
//        System.out.println(j);
        ForkJoinPool pool = new ForkJoinPool();
        System.out.println(new Date());
    }
}
