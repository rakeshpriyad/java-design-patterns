package com.threads;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class PrintNumberBloquingQ implements Runnable {
    PrintNumberBloquingQ next;
    LinkedBlockingQueue<Integer> queue;
    public PrintNumberBloquingQ(){
         queue = new LinkedBlockingQueue<>();
    }
    @Override
    public void run() {
        int i = 0;
        while (true) {
          try {
              Thread.sleep(1000);
              i = queue.take();
          }catch (InterruptedException ie){
              ie.printStackTrace();
          }

          System.out.println(Thread.currentThread().getName() + " = " + i);
          next.accept(++i);
        }

    }

    public void accept(int i){
        try {
          queue.put(i);
        }catch (InterruptedException ie){
            ie.printStackTrace();
        }
    }
}
