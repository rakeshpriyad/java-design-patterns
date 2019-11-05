package com.threads;

import java.util.concurrent.atomic.AtomicInteger;

public class PrintNumber implements Runnable {
    private Object monitor;
    private Integer threadId;
    private Integer numberOfThreads;
    private AtomicInteger number;
    public PrintNumber(AtomicInteger number,Object monitor, Integer numberOfThreads, Integer threadId){
        this.monitor = monitor;
        this.numberOfThreads = numberOfThreads;
        this.threadId = threadId;
        this.number = number;
    }
    @Override
    public void run() {
        print();
    }

    public void print(){
        try {


            while (number.get() <= 10) {
                Thread.sleep(1001);
                synchronized (monitor) {
                    if (number.get() % numberOfThreads != threadId) {
                        monitor.wait();
                    }else {
                        System.out.println("threadId : "+ Thread.currentThread().getName() + ": : " + number.getAndIncrement());
                        monitor.notifyAll();
                    }
                }

            }
        }catch (InterruptedException ie){
            ie.printStackTrace();
        }
    }
}
