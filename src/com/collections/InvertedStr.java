package com.collections;

import java.util.*;

/**
 * Created by student on 07.05.2018.
 */
public class InvertedStr {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Deque<Character> queue = new ArrayDeque<>();

        System.out.print("Enter string: ");
        String str = scanner.next();
        char[] charArray = str.toCharArray();

        for (char c : charArray) {
            queue.addFirst(c);
        }

        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = queue.pollFirst();
        }

        StringBuilder sb = new StringBuilder(charArray.length);
        for (char c : charArray) {
            sb.append(c);
        }

        System.out.println("result: " + sb.toString());
    }
}
