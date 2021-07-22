package day3;

import day1.model.Person;

import java.time.LocalDate;

public class GenericBoxDemo {
    public static void main(String[] args) {
        GenericBox<String> wagon1 = new GenericBox<String>(10, "Pudełko zielone");
        GenericBox<Person> wagon2 = new GenericBox<Person>(82, new Person("Adrian","Rogalski", LocalDate.parse("1999-07-11")));

        // Problem dzielenia przez 0
        // Zamiast zwracac wyjatek moge sprawdzac co jest w srodku pudelka

        System.out.println("Zawartość: " + wagon1.getContent());
        System.out.println("czysze wagon");
        wagon1.clear();
        System.out.println("Czy coś jest w wagonie" + wagon1.isPresent());
    }
}
