package day4;

import day3.Person;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Person> people = new HashMap<>();
        people.put("adam@op.pl",
                new Person("Adam", 78, LocalDate.of(2000,10,11)));
        people.put("kasia@op.pl",
                new Person("Kasia", 64, LocalDate.of(2010,10,11)));
        people.put("adam@op.pl",
                new Person("Zbyszek", 48, LocalDate.of(2010,12,11)));

        System.out.println("Pobieramy osobę spod klucza adam@op.pl " + people.get("adam@op.pl"));
        // Klasa Map w przypadku zrobienia literowki W KLUCZU zwraca nulla!!!! co moze powodowac duzo bledow bo nie ma wyjatku i musze robic
        // null checki są nieznbędne niesety
        Person person = people.get("ada@op.pl");
        if (person != null) {
            if (person.getBirthDate() != null) {
                System.out.println(person.getBirthDate().getYear());
            }
        }
        // moge alternatywnie sprawdzic czy mapa zawiera klucz, containsKey(key) ale i tak ktos moze mi tam wrzucic nulla wiec
        // wewnetrzny null check z birthday i tak bedzie niezbedny
        // Dobra praktyka jest oprogramowanie funkcji put aby nie przyjmowala nulla
        // Iterowanie po mapie
        // Po kluczach
        System.out.println("Zbiór kluczy " + people.keySet());
        // Po wartościach
        System.out.println("Zbirór wartosci (gdzie sa typem Collection)" + people.values());

        // przegladanie kolekcji typu mapa
        // Tworzy z mapy zbior par klucz-wartosc
        for (Map.Entry<String, Person> entry: people.entrySet()) {
            System.out.println(entry.getKey() + entry.getValue());
        }
    }
}
