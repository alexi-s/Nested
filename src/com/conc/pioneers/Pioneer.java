package com.conc.pioneers;

import java.util.concurrent.CountDownLatch;

/**
 * Created by student on 23.05.2018.
 */
public class Pioneer extends Thread {

    int number;
    CountDownLatch c;

    public Pioneer(int number, CountDownLatch c) {
        this.number = number;
        this.c = c;
    }

    @Override
    public void run() {
        try {
            System.out.println("Pioneer " + number + " is here");
            c.countDown();
            c.await();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("My number is " + number);
    }
}
