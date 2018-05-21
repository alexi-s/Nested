package com.conc;

/**
 * Created by student on 21.05.2018.
 */
public class MainCash {

    public static void main(String[] args) {

        Purse myPurse = new Purse(500);
        Thread t1 = new TrSub(myPurse, 50, 3);
        Thread t2 = new TrSub(myPurse, 20, 1);
        Thread t3 = new TrAdd(myPurse, 500, t1, t2);

        t1.setName("SUB_50)");
        t2.setName("SUB_20");
        t3.setName("ADD_500");

        t1.start();
        t2.start();
        t3.start();
    }
}
