package com.patterns.strategy;

/**
 * Created by student on 30.05.2018.
 */
public class Main {

    public static void main(String[] args) {
        Room r = new Room();
        r.setContext(new CatSay());
        r.saySomething();

        r.setContext(new DogSay());
        r.saySomething();

        r.setContext(new HumanSay());
        r.saySomething();

    }
}
