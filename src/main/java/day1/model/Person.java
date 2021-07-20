package day1.model;

import java.time.LocalDate;

public class Person{
    String firstName;
    String lastName;
    LocalDate birthDate;

    public Person(String firstName, String lastName, LocalDate birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public Person() {
    }

    public String getFirstName(){
        return firstName;
    }

    public String toString(){
        return firstName + ", " + lastName + ", " + birthDate;
    }
}
