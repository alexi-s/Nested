package com.conc.resto;

import java.util.concurrent.Semaphore;

/**
 * Created by student on 23.05.2018.
 */
public class Place extends Thread {

    Semaphore semaphore;
    HungryMan hungryMan;

    public Place(HungryMan hungryMan, Semaphore semaphore) {
        this.hungryMan = hungryMan;
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        try {
            semaphore.acquire();
            System.out.println("Relative " + hungryMan.number + " come in");
            Thread.sleep(2000);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Relative " + hungryMan.number + " has gone, place is empty");
    }
}
