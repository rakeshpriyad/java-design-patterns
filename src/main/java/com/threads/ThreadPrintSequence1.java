package com.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadPrintSequence1 {

    public static void main(String[] args) {

        ThreadPrintSequence1 threadPrintSequence1 = new ThreadPrintSequence1();
        threadPrintSequence1.print();
    }

    public void print() {
        AtomicInteger number = new AtomicInteger(1);
        Object monitor = new Object();
        Integer numberOfThread = 3;
        Integer threadId = 1;


        Runnable r = () -> {
            try {


                while (number.get() <= 10) {
                    Thread.sleep(1001);
                    synchronized (monitor) {
                        //System.out.println(number.get() % numberOfThread );
                        if (number.get() % numberOfThread != Integer.valueOf(Thread.currentThread().getName())) {
                            monitor.wait();
                        } else {
                            System.out.println("threadId : " + Thread.currentThread().getName() + ": : " + number.getAndIncrement());
                            monitor.notifyAll();
                        }
                    }

                }
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        };

        Thread t1 = new Thread(r, "1");
        Thread t2 = new Thread(r, "2");
        Thread t3 = new Thread(r,"0");
        t1.start();
        t2.start();
        t3.start();
    }
}
