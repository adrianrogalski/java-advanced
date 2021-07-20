package day1.app;

import day1.model.Person;
import day1.model.Student;
import day1.model.Worker;

import java.math.BigDecimal;
import java.time.LocalDate;

public class InheritanceDemo {
    public static void main(String[] args) {
        Worker worker = new Worker("Adam",
                "Kowalski",
                LocalDate.of(2000,10,1),
                new BigDecimal("1500.5"),
                "mgr. inż.");
        worker.setFirstName("Zenon");
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

        // Konsekwencje dziedziczenia
        Person ewa = new Student("Ewa",
                "Kowalski",
                LocalDate.of(2000,10,1),
                25111,
                "Java od podstaw");
        // pomimo ze wyswietla wszystkie pola jak dla obiektu Student to dostep do klasy student
        // mam tylko taki jak dla obiektu person przez referencje
        System.out.println(ewa);
        //
        Person[] club = new Person[3];
        club[0] = worker;
        club[1] = ewa;
        club[2] = student;

        // Polimorfizm(na każdej metodzie dziedziczonych obiektów robie tą samą akacje ale zachowanie tej akcji jest inny)
        // Pomimo że do wywołania metody toString() posługuje sie referencja Person to toString jest interpretowana jako  (nie ważny jaki typ referencji ważne jaki jest rzeczywisty typ obiektu)

        for (Person person: club){

        }
    }
}
