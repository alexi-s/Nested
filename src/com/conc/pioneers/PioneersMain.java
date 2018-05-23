package com.conc.pioneers;

import java.util.Random;
import java.util.concurrent.CountDownLatch;

/**
 * Created by student on 23.05.2018.
 */
public class PioneersMain {

    private static final CountDownLatch count = new CountDownLatch(23);

    public static void main(String[] args) {

        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            try {
                Thread.sleep(random.nextInt(2000) + 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            new Pioneer(i + 1, count).start();
        }

        while (count.getCount() > 3) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("\n - Are you ready?");
        count.countDown();

        System.out.println(" - Yes, captain!");
        count.countDown();

        System.out.println(" - Let's go!\n");
        count.countDown();

    }
}
