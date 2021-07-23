package day4;

import day3.Person;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class HashCodeEqualsDemo {
    public static void main(String[] args) {
        Person p1 = new Person("Adrian",72, LocalDate.of(1999,07,11));
        Person p2 = new Person("Adrian",72, LocalDate.of(1999,07,11));
        System.out.println(p1.equals(p2));
        Set<Person> people = new HashSet<>();
        // metoda add HashSetu generuje hashCode
        people.add(p1);
        // generuje hashCode
        people.add(p2);
        // ale hash code juz jest o tej wartosci wiec wywowluje metode equals zeby sprawidz czy to aby nie ten sam obeikt
        System.out.println(people);
    }
}
