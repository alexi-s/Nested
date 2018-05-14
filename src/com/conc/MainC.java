package com.conc;

/**
 * Created by student on 14.05.2018.
 */
public class MainC {

    public static void main(String[] args) {
        T1 t1 = new T1();
        T1 t2 = new T1();
        T1 t3 = new T1();
        T1 t4 = new T1();
        //T1 t2 = new T1(t1);
        t1.setName("T1");
        t2.setName("T2");
        t3.setName("T3");
        t4.setName("T4");
        t1.start();
        t2.start();
        t3.start();
        t4.start();

        System.out.println("main has ended");

        try {
            Thread.sleep(1000);
            //t1.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
/*        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        */

        t1.interrupt();
        t2.interrupt();
        t3.interrupt();
        t4.interrupt();
    }
}
