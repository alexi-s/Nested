package com.conc;

/**
 * Created by student on 21.05.2018.
 */
public class TrSub extends Thread {

    private Purse purse;
    private double rate;
    private int time;

    public TrSub(Purse purse, double rate, int seconds) {
        this.purse = purse;
        this.rate = rate;
        this.time = seconds;
    }

    @Override
    public void run() {
        while (purse.getCash() - rate > 0) {
            purse.spendMoney(rate);
            System.out.println("-" + rate + ", total: " + purse.getCash());
            try {
                Thread.sleep(time * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Game over. Rest " + purse.getCash());
        System.exit(0);
    }
}
