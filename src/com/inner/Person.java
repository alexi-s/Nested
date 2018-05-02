package com.inner;

/**
 * Created by student on 02.05.2018.
 */
public class Person {

    private String firstName;
    private String lastName;
    private String middleName;

    private Person() {

    }

    public static Builder newBuilder() {
        return new Person().new Builder();
    }

    public Builder toBuilder(){
        return this.new Builder();
    }

    public class Builder {

        private Builder() {

        }

        public Builder setFirstName(String firstName) {
            Person.this.firstName = firstName;
            return this;
        }


        public Builder setLastName(String lastName) {
            Person.this.lastName = lastName;
            return this;
        }

        public Builder setMiddleName(String middleName) {
            Person.this.middleName = middleName;
            return this;
        }

        public Person build() {
            return Person.this;
        }

    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                '}';
    }
}
