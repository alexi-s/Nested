package com.conc;

import java.util.Collection;
import java.util.Queue;
import java.util.Random;

/**
 * Created by student on 14.05.2018.
 */
public class TCW extends Thread {

    private Queue<Integer> collection;

    public TCW(Queue<Integer> collection) {
        this.collection = collection;
    }

    @Override
    public void run() {
        Random random = new Random();
        for (int i = 0; i < 50; i++) {
            collection.add(random.nextInt(50));
            System.out.println("Added file to print queue");
            try {
                Thread.sleep(random.nextInt(10000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
