package com.conc.blocking_queue;

import java.util.concurrent.BlockingQueue;

/**
 * Created by student on 25.05.2018.
 */
public class Consumer implements Runnable {

    private final BlockingQueue<Long> queue;

    public Consumer(BlockingQueue<Long> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            while (!Thread.currentThread().isInterrupted()){
                consume(queue.take());
                System.out.println("consumer");
            }
        } catch (InterruptedException e){

        }
    }

    void consume(Long dt){
        System.out.println(dt);
    }
}
