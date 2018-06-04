package com.files;

import java.io.Serializable;

/**
 * Created by student on 04.06.2018.
 */
public class Car implements Serializable {

    private String color;
    private int year;
    private int maxSpeed;
    private transient int passengers;

    public Car(String color, int year, int maxSpeed, int passengers) {
        this.color = color;
        this.year = year;
        this.maxSpeed = maxSpeed;
        this.passengers = passengers;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (year != car.year) return false;
        if (maxSpeed != car.maxSpeed) return false;
        if (passengers != car.passengers) return false;
        return color != null ? color.equals(car.color) : car.color == null;

    }

    @Override
    public int hashCode() {
        int result = color != null ? color.hashCode() : 0;
        result = 31 * result + year;
        result = 31 * result + maxSpeed;
        result = 31 * result + passengers;
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", year=" + year +
                ", maxSpeed=" + maxSpeed +
                ", passengers=" + passengers +
                '}';
    }
}