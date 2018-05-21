package com.conc;

/**
 * Created by student on 21.05.2018.
 */
public class MainS {

    public static void main(String[] args) {
        Counter c1 = new Counter();
        Thread t1 = new CounterWork(c1);
        Thread t2 = new CounterWork(c1);

        t1.setName("T1");
        t2.setName("T2");

        t1.start();
        t2.start();
    }
}
