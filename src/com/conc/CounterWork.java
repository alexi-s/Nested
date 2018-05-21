package com.conc;

/**
 * Created by student on 21.05.2018.
 */
public class CounterWork extends Thread {

    private Counter counter;

    public CounterWork(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
    //        synchronized (counter) {
                System.out.print(getName() + " was " + counter.getCount() + "\t");
                counter.increment();
                System.out.println(" now is " + counter.getCount());
    //        }
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
    }
}
