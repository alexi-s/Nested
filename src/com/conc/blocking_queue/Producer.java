package com.conc.blocking_queue;

import java.util.concurrent.BlockingQueue;

/**
 * Created by student on 25.05.2018.
 */
public class Producer implements Runnable {

    private final BlockingQueue<Long> queue;

    private long i;

    public Producer(BlockingQueue<Long> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            while (!Thread.currentThread().isInterrupted()) {
                queue.put(produce());
                System.out.println("producer");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
//            e.printStackTrace();
        }
    }


    Long produce() {
        return i++;
    }
}
