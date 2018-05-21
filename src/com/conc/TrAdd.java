package com.conc;

import java.util.Random;

/**
 * Created by student on 21.05.2018.
 */
public class TrAdd extends Thread {

    private Purse purse;
    private double rate;
    private Thread t1, t2;

    public TrAdd(Purse purse, double rate, Thread t1, Thread t2) {
        this.purse = purse;
        this.rate = rate;
    }

    @Override
    public void run() {
        Random random = new Random();
        int time;
//        while (t1.isAlive() || t2.isAlive()) {
        while (true) {
            purse.addMoney(500);
            System.out.println("Salary! + 500, total: " + purse.getCash());
            time = 20000 + random.nextInt(10000) - 5000;
            System.out.println("sleep = " + time);
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
