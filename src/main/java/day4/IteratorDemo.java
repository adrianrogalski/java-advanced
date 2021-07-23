package day4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) {
        Collection<String> names = new ArrayList<>(List.of("Ala", "Ola", "Adam", "Ewa"));
        // Chce usunąć wszystkie imiona na a
        // Nie mozna modyfikowac kolekcji podczas przegladania instrukcja for each bo za kazdym razem bedzie inna liczba elementów
//        for (String name: names) {
//            if (name.startsWith("A")){
//                names.remove(name)
//            }
//        }

        // PRZEGLADANIE KOLEKCJI Z ITERATOREM JAVA UTIL <=> inteligentny wskaznik wskazuje miejsce przed 1 elementem
        Iterator<String> iterator = names.iterator();
        // przed wyciagnieciem z iteratora nastepnego elementu moim OBOWIAZKIEM jest sprawdzenie czy w kolekcji jest nastepny element przed jego pobraniem
        while (iterator.hasNext()) {
            String name = iterator.next();
            if (name.startsWith("A")) {
                iterator.remove();
            }
        }
        /*
        iterator porusza sie zawsze do przodu, przy zwyklym for indeksuje i kazde usuniecie elementu powoduje zmiane indeksu
        w iteratorze nie ma tego problemu
        ^Ala Ola Adam
        iterator.next
        Ala^Ola Adam
        iterator.remove(Ala)
        ^Ola Adam
         */

        // Iteratory moge wyciagac z kazdej kolekcji
    }
}
