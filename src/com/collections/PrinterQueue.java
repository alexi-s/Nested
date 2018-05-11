package com.collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by student on 11.05.2018.
 */
public class PrinterQueue {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Queue<String> queue = new LinkedList<>();

        String file;

        System.out.println("Enter file names (type \"quit\" to exit):");
        while (true) {
            file = scanner.next();
            if (file.equals("quit")) {
                break;
            }
            queue.add(file);
        }

        while (queue.size() > 0) {
            System.out.println("Print \"" + queue.poll() + "\"\t files in queue: " + queue.size());
        }
    }
}
