package com.patterns.strategy;

/**
 * Created by student on 30.05.2018.
 */
public class Room {

    private Say s;

    public void setContext(Say s) {
        this.s = s;
    }

    public void saySomething() {
        s.say();
    }
}
