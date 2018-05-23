package com.conc.resto;

import java.util.concurrent.Semaphore;

/**
 * Created by student on 23.05.2018.
 */
public class Main {
    public static void main(String[] args) {

        Semaphore s = new Semaphore(4);
        for (int i = 0; i < 20; i++) {
            new Place(new HungryMan(i), s).start();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
