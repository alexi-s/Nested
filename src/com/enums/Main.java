package com.enums;

/**
 * Created by student on 02.05.2018.
 */
public class Main {

    public static void main(String[] args) {

        for (DaysOfWeek dayOfWeek : DaysOfWeek.values()) {
            System.out.println(dayOfWeek + " " + dayOfWeek.getDay() + " " + dayOfWeek.getShortDay());
        }

        DaysOfWeek d1 = DaysOfWeek.MONDAY;
        DaysOfWeek d2 = DaysOfWeek.MONDAY;
        DaysOfWeek d3 = DaysOfWeek.SATURDAY;

        System.out.println(d1 == d2);
        System.out.println(d1 == d3);
        System.out.println(d1.compareTo(d2));

    }
}
