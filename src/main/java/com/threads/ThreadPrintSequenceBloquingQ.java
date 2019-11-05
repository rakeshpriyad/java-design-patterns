package com.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadPrintSequenceBloquingQ {

    public static void main(String[] args) {
       PrintNumberBloquingQ q1 = new PrintNumberBloquingQ();
        PrintNumberBloquingQ q2 = new PrintNumberBloquingQ();
        PrintNumberBloquingQ q3 = new PrintNumberBloquingQ();

        q1.next = q2;
        q2.next = q3;
        q3.next = q1;
        /*Thread t1 = new Thread(q1, "T1");
        Thread t2 = new Thread(q2, "T2");
        Thread t3 = new Thread(q3, "T3");
        t1.start();
        t2.start();
        t3.start();
        q1.accept(1);*/
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.submit(q1);
        executorService.submit(q2);
        executorService.submit(q3);
        q1.accept(1);
    }
}
