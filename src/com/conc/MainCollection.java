package com.conc;

import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * Created by student on 14.05.2018.
 */
public class MainCollection {

    public static void main(String[] args) {

        ConcurrentLinkedQueue c1 = new ConcurrentLinkedQueue();
        TCW write = new TCW(c1);
        TCR read = new TCR(c1);

        write.start();
        read.start();

        try {
            write.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        read.interrupt();

    }
}
