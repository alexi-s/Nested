package com.inner;

/**
 * Created by student on 02.05.2018.
 */
public class Main {

    public static void main(String[] args) {

        Ship titanic = new Ship(6.66);
        Ship.Engine engine = titanic.new Engine();
        titanic.setEngine(engine);
        // System.out.println(titanic);

        titanic.doWork();


//        Person p1 = Person.newBuilder()
//                .setFirstName("Ivan")
//                .setLastName("Ivanov")
//                .build();
//
//        System.out.println(p1);
//        p1.toBuilder()
//                .setMiddleName("Ivanovich");
//                // .build(); - можно не писать
//
//        System.out.println(p1);
    }
}
