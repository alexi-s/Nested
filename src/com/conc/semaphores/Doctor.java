package com.conc.semaphores;

import java.util.concurrent.Semaphore;

/**
 * Created by student on 23.05.2018.
 */
public class Doctor extends Thread {

    Patient p;
    Semaphore s;

    public Doctor(Patient p, Semaphore s) {
        this.p = p;
        this.s = s;
    }

    @Override
    public void run() {
        try {
            s.acquire();
            System.out.println("Doctor started with patient # " + p.number);
            Thread.sleep(1000);
            s.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Doctor has ended with patient # " + p.number);
    }
}
