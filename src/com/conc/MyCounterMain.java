package com.conc;

/**
 * Created by student on 23.05.2018.
 */
public class MyCounterMain {

    public static void main(String[] args) {
        MyCounter m = new MyCounter();
        MyCounterThread[] tg = new MyCounterThread[100];
        for (int i = 0; i < 100; i++) {
            tg[i] = new MyCounterThread(m, 1000000);
        }

        for (MyCounterThread myCounterThread : tg) {
            myCounterThread.start();
        }

        try {
            for (MyCounterThread thread : tg) {
                thread.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("int " + m.a1);
        System.out.println("vol " + m.a2);
        System.out.println("atom " + m.a3.get());
    }
}
