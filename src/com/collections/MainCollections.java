package com.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by student on 04.05.2018.
 */
public class MainCollections {

    public static void main(String[] args) {

        Collection<String> c1 = new ArrayList<>();
        c1.add("Hello");
        c1.add("World");
        System.out.println(c1);

        c1.remove("Hello");
        System.out.println(c1);

        List<String> c2 = new ArrayList<>();
        c2.add("Super");
        c2.add("Family");
        System.out.println(c2);
        c2.remove(1);
        System.out.println(c2);

        ArrayList<String> c3 = new ArrayList<>();

        List<String> l1 = new LinkedList<>();
        l1.add("Hello");
        System.out.println(l1);
        System.out.println();

        LinkedList<String> l2 = new LinkedList<>();
        l2.add("Hello");
        l2.add("World");
        l2.add("My Friend");
        System.out.println(l2.size());
        System.out.println(l2.peek());
        System.out.println(l2.size());
        System.out.println();

        System.out.println(l2.size());
        System.out.println(l2.poll());
        System.out.println(l2.size());
        System.out.println();
        System.out.println(l2.size());
        System.out.println(l2.pop());
        System.out.println(l2.size());
    }
}
