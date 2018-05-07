package com.collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by student on 07.05.2018.
 */
public class Q {

    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>();
        q1.offer(1);
        q1.offer(4);
        q1.offer(7);

        System.out.println(q1);
        System.out.println(q1.poll());
        System.out.println(q1.remove());
        System.out.println(q1.peek());
        System.out.println(q1.element());
        System.out.println();

        Deque<Integer> d1 = new ArrayDeque<>();
        d1.addFirst(2);
        d1.addFirst(6);
        d1.add(99);
        System.out.println(d1);
        System.out.println(d1.pollFirst());
        System.out.println(d1.pollFirst());
        System.out.println(d1.pollFirst());

    }
}
