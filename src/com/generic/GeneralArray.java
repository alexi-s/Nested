package com.generic;

/**
 * Created by student on 04.05.2018.
 */
public class GeneralArray {

    public static <T> void printArray(T[] array){
        for (T t : array) {
            System.out.println(t);
        }
    }
}
