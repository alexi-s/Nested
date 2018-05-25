package com.conc.blocking_queue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by student on 25.05.2018.
 */
public class BC {

    public static void main(String[] args) {
        BlockingQueue<Long> queue = new LinkedBlockingQueue<>();
        Producer p = new Producer(queue);
        Consumer c = new Consumer(queue);
        Thread pp = new Thread(p);
        pp.start();
        Thread cc = new Thread(c);
        cc.start();

        try {
            Thread.sleep(25000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        pp.interrupt();
        cc.interrupt();
    }
}
