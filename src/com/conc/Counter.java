package com.conc;

/**
 * Created by student on 21.05.2018.
 */
public class Counter {

    int count = 0;

    public void increment() {
        synchronized (this) {
            count++;
        }
    }

    public int getCount() {
        synchronized (this) {
            return count;
        }
    }
}
