package com.conc;

/**
 * Created by student on 14.05.2018.
 */
public class MyMain {

    public static void main(String[] args) {

        MyClassT thread1 = new MyClassT();
        thread1.setName("thread1");

        MyClassR t = new MyClassR();
        Thread thread2 = new Thread(t);
        thread2.setName("thread2");

        thread1.start();
        thread2.start();

        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("main has ended");
    }
}
