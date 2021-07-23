package day4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionDemo {
    public static void main(String[] args) {
        // Z punktu widzenia interfejsu collection implementuje klase generyczną ArrayList ze Stringami
        Collection<String> names = new ArrayList<>();
        // Kolekcja jest mutowalna
        boolean isInserted = names.add("Ala");
        System.out.println("Czy imie zostało dodane? " + isInserted);
        names.add("Adam");
        names.add("Patryk");
        System.out.println("Rozmiar kolekcji names " + names.size());
        // chce dodac do mojej kolekcji inna kolekcje
        List<String> newNames = List.of("Beata", "Roman");
        // poniewaz list pasuje do collection bo z niej dziedziczy moge ja polaczyc
        names.addAll(newNames);

        // kolekcje moge bez problemu wyswietlac bez petli
        System.out.println(names);
        System.out.println("Czy jest imie Roman? " + names.contains("Roman"));
        names.remove("Adam");

    }
}
