package com.conc;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by student on 23.05.2018.
 */
public class MyCounter {

    public int a1;
    public volatile int a2;
    public AtomicInteger a3 = new AtomicInteger(0);

}
