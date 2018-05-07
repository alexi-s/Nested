package com.collections;

import java.time.Instant;
import java.util.*;

/**
 * Created by student on 07.05.2018.
 */
public class Hs {

    public static void main(String[] args) {

        Set<Person> s1 = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.name.compareTo(o2.name);
            }
        });

        s1.add(new Person("Ivan"));
        s1.add(new Person("Maxim"));
        System.out.println(s1.add(new Person("Andrei")));
        System.out.println(s1.add(new Person("Andrei")));

        System.out.println(s1);
        // System.out.println(Instant.now());
        s1.add(new Person("Vitya"));
        s1.add(new Person("Alexey"));
        s1.add(new Person("Sergio"));
        s1.add(new Person("Voland"));

        System.out.println(s1);
    }
}
