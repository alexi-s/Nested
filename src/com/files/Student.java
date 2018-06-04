package com.files;

import com.collections.*;

import java.io.Serializable;

/**
 * Created by student on 04.06.2018.
 */
public class Student extends Person {

    private int age;

    public Student() {
    }

    public Student(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                "} " + super.toString();
    }
}
