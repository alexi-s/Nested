package com.patterns.strategy;

/**
 * Created by student on 30.05.2018.
 */
public class CatSay implements Say {
    @Override
    public void say() {
        System.out.println("I'm the cat");
    }
}
