package com.collections;

import javafx.util.Pair;

import java.util.*;

/**
 * Created by student on 11.05.2018.
 */
public class MainMap {

    public static void main(String[] args) {

        Map<String, Integer> m1 = new HashMap<>();
        m1.put("k1", 1);
        m1.put("k2", 1);
        System.out.println(m1.put("k3", 3));
        System.out.println(m1.put("k1", 2));

        System.out.println(m1);

        System.out.println(m1.get("k1"));
        System.out.println(m1.keySet());

        m1.replace("k1", 55);
        System.out.println(m1);
        System.out.println(m1.values());
        m1.remove("k1");
        System.out.println(m1);
        System.out.println(m1.remove("k2", 2));
        System.out.println(m1.remove("k3", 3));
        System.out.println(m1);

        System.out.println(m1.putIfAbsent("k3", 2));
        System.out.println(m1.putIfAbsent("k3", 2));
        System.out.println(m1);

        System.out.println(m1.replace("k3", 44, 17));
        System.out.println(m1);

        System.out.println(m1.get("dsvgrgr"));
        m1.put(null, 12);
        System.out.println(m1);
        System.out.println(m1.get(null));

        Iterator<Map.Entry<String, Integer>> i1 = m1.entrySet().iterator();
        while (i1.hasNext()){
            Map.Entry<String, Integer> e = i1.next();
            System.out.println("Key: " + e.getKey() + ", value=" + e.getValue());
        }

        System.out.println();

        for (Map.Entry<String, Integer> entry : m1.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", value=" + entry.getValue());
        }

        List<Map<String, Map<String, Map<String, Pair<Integer,Integer>>>>> p1;

        Map<String, List<String>> d1 = new HashMap<>();
        d1.put("Hello", new ArrayList<>());
        d1.put("World", new LinkedList<>());
    }
}
