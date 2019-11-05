package com.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadPrintSequence {

    public static void main(String[] args) {
        AtomicInteger number = new AtomicInteger(1);
        Object monitor = new Object();
        Integer numberOfThread = 3;
        /*Thread t1 = new Thread(new PrintNumber(number,monitor, numberOfThread, 1), "Thread1");
        Thread t2 = new Thread(new PrintNumber(number,monitor, numberOfThread, 2), "Thread2");
        Thread t3 = new Thread(new PrintNumber(number,monitor, numberOfThread, 0),"Thread3");
        t1.start();
        t2.start();
        t3.start();*/

        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.submit(new PrintNumber(number,monitor, numberOfThread, 1));
        executorService.submit(new PrintNumber(number,monitor, numberOfThread, 2));
        executorService.submit(new PrintNumber(number,monitor, numberOfThread, 0));
    }
}
