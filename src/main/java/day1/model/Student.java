package day1.model;

import java.time.LocalDate;

public class Student extends  Person {
    int album;
    String course;

    // tzw przeciążanie konstruktora => inna ilosc argumentow dla konstruktora tej samej nazwy
    public Student(String firstName, String lastName, LocalDate birthDate, int album, String course) {
        // odwolanie do konstruktora superklasy
        super(firstName, lastName, birthDate);
        this.album = album;
        this.course = course;
    }

    public Student() {
    }

    public final String asPersonString() {
        return super.toString() + ", " + album + ", " + course;
    }

    // "nadaj nowe znaczenie dziedziczonej metody toString" przeładowywanie/nadpisanie metod
    @Override
    public String toString(){
        return super.toString() + ", " + album + ", " + course;
    }
}
