package com.patterns.strategy;

/**
 * Created by student on 30.05.2018.
 */
public class HumanSay implements Say {
    @Override
    public void say() {
        System.out.println("I'm the human");
    }
}
