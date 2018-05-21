package com.conc;

/**
 * Created by student on 21.05.2018.
 */
public class Purse {

    private double cash;

    public Purse(double cash) {
        this.cash = cash;
    }

    public double getCash() {
        return cash;
    }

    public synchronized void spendMoney(double sum) {
        cash -= sum;
    }

    public synchronized void addMoney(double sum) {
        cash += sum;
    }
}
