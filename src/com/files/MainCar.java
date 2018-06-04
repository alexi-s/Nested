package com.files;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 04.06.2018.
 */
public class MainCar {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Car car1 = new Car("red", 2009, 168, 5);
        Car car2 = new Car("blue", 2015, 220, 4);
        Car car3 = new Car("yellow", 1976, 250, 2);
        Car car4 = new Car("black", 1990, 156, 4);

        Parking p1 = new Parking();
        p1.addCar(car1);
        p1.addCar(car2);

        Parking p2 = new Parking();
        p2.setNumber(2);
        p2.addCar(car3);
        p2.addCar(car4);

        List<Parking> parkings = new ArrayList<>();
        parkings.add(p1);
        parkings.add(p2);

        FileOutputStream fos = new FileOutputStream("parking_collection.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(parkings);
        oos.close();

        FileInputStream fis = new FileInputStream("parking_collection.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);

        List<Parking> parkingCollection2 = (List<Parking>) ois.readObject();
        ois.close();

        System.out.println(parkingCollection2);
    }
}
