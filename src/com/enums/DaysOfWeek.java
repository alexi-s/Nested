package com.enums;

/**
 * Created by student on 02.05.2018.
 */
public enum DaysOfWeek {
    MONDAY(1, "MON"),
    TUESDAY(2, "TUE"),
    WEDNESDAY(3, "WED"),
    THURSDAY(4, "THU"),
    FRIDAY(5, "FRI"),
    SATURDAY(6, "SAT"),
    SUNDAY(7, "SUN");

    private int day;
    private String shortDay;
    DaysOfWeek(int day, String shortDay) {
        this.day = day;
        this.shortDay = shortDay;
    }

    public int getDay() {
        return day;
    }

    public String getShortDay() {
        return shortDay;
    }
}
