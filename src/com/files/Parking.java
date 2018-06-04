package com.files;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 04.06.2018.
 */
public class Parking implements Serializable {

    private List cars = new ArrayList<Car>();
    private int number = 1;

    public void setNumber(int number) {
        this.number = number;
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    @Override
    public String toString() {
        return "Parking{" +
                "cars=" + cars +
                ", number=" + number +
                '}';
    }
}
