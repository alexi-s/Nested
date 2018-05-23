package com.conc.semaphores;

import java.util.concurrent.Semaphore;

/**
 * Created by student on 23.05.2018.
 */
public class DoctorMain {

    public static void main(String[] args) {

        Semaphore s = new Semaphore(2);
        for (int i = 0; i < 10; i++) {
            new Doctor(new Patient(i), s).start();
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
