package com.collections;

import java.util.*;

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

/*        LinkedList<String> l2 = new LinkedList<>();
        l2.add("Hello");
        l2.add("World");
        l2.add("My Friend");
        l2.add(null);

        Iterator<String> i1 = l2.iterator();
        System.out.println(l2.size());
        System.out.println(i1.next());
        System.out.println(i1.hasNext());
        System.out.println(i1.next());
        System.out.println(i1.next());
        System.out.println(i1.next());
        System.out.println(i1.hasNext());
        System.out.println();

        System.out.println("" + l2.size());

        ListIterator<String> i2 = l2.listIterator(1);
        System.out.println(i2.hasNext());
        System.out.println(i2.previous());
        System.out.println(i2.hasPrevious());
        System.out.println(i2.hasNext());
        System.out.println(i2.next());
        i2.remove();
        System.out.println(l2.size());
        System.out.println(i2.next());
        System.out.println(i2.nextIndex());

        System.out.println();*/

        Collection<String> l2 = new LinkedHashSet<>();
        l2.add("Hello");
        l2.add("World");
        l2.add("My Friend");

        Iterator<String> i3 = l2.iterator();
        while (i3.hasNext()) {
            System.out.println(i3.next());
        }

    }
}
