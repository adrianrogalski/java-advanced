package day1.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class InheritanceDemo {
    public static void main(String[] args) {
        Worker worker = new Worker("Adam",
                "Kowalski",
                LocalDate.of(2000,10,1),
                new BigDecimal("1500.5"),
                "mgr. inż.");
        // bezpieczniej jest tworzyć BigDecimala jako nowy łańcuch a nie np. BigDecimal.valueof(1500.5)
        Student student = new Student("Jan",
                "Kowalski",
                LocalDate.of(2000,10,1),
                25111,
                "Java od podstaw");
        // println zaklada ze kazdy argument jest obiektem w ktorym moze wywolac funkcje toString
        System.out.println(worker);
        // klasy dziedzicza z automatu klase Object i jej wszystkie metody
        String toString = worker.toString();
        System.out.println(student);
    }
}
