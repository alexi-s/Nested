package com.files;

import java.io.Serializable;

/**
 * Created by student on 04.06.2018.
 */
public class Person implements Serializable {

    private static final long serialVersionUID = -651901742925058522L;
    protected String firstName;
    protected String lastName;

    public Person() {
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
