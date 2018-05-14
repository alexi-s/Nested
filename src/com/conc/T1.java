package com.conc;

import java.util.Random;

/**
 * Created by student on 14.05.2018.
 */
public class T1 extends Thread {

    private Thread thread;

    public T1() {
    }

    public T1(Thread thread) {
        this.thread = thread;
    }

//    @Override
//    public void run() {
//
//        if (thread != null){
//            try {
//                thread.join();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//
//        for (int i = 0; i < 5 ; i++) {
//            System.out.println("Thread " + getName() + " - " + isInterrupted());
//            try {
//                Thread.sleep(new Random().nextInt(2000));
//            } catch (InterruptedException e) {
//                // e.printStackTrace();
//                System.out.println(getName() + " interrupted " + isInterrupted());
//                return;
//            }
//        }
//        System.out.println(getName() + " ended");
//    }


    @Override
    public void run() {
        int i = 0;
        while (!isInterrupted()) {
            if (getName().equals("T1")) {
                Thread.yield();
            }
            i++;
        }
        System.out.println(getName() + " " + i);
    }
}
