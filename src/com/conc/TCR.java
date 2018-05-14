package com.conc;

import java.util.Collection;
import java.util.Queue;
import java.util.Random;

/**
 * Created by student on 14.05.2018.
 */
public class TCR extends Thread {

    private Queue<Integer> collection;

    public TCR(Queue<Integer> collection) {
        this.collection = collection;
    }

    @Override
    public void run() {
        while (!isInterrupted()){
            if (collection.size() > 0) {
                Integer fileNumber = collection.poll();
                System.out.println("I'm printing file with number " + fileNumber);
                try {
                    Thread.sleep(new Random().nextInt(6666));
                } catch (InterruptedException e) {
                    return;
                }
                System.out.println("I have printed file with number " + fileNumber +
                        "\n Current queue size is " + collection.size());
            } else {
                System.out.println("Waiting for files...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    return;
                }
            }
        }
    }
}
