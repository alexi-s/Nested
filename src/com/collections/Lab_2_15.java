package com.collections;

import java.util.*;

/**
 * Created by student on 11.05.2018.
 */
public class Lab_2_15 {

    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list1.add(i, "number_" + i);
        }

        System.out.println(list1);

        List<String> list2 = new LinkedList<>();
        int[] indexArray = new int[10];
        Random random = new Random();
        int randomValue;
        boolean absent;
        for (int i = 0; i < 10; i++) {
            do {
                absent = false;
                randomValue = random.nextInt(10);
                for (int j = 0; j < i; j++) {
                    if (randomValue == indexArray[j]) {
                        absent = true;
                        break;
                    }
                }
            } while (absent);
            indexArray[i] = randomValue;
            list2.add(i, "number_" + randomValue);
        }
        System.out.println(Arrays.toString(indexArray));
        System.out.println(list2);
    }
}
