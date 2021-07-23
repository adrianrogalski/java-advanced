package day4;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        // w set koljenosci nie jest zachowana a wartosci dodawane sa do indeksow w hashset za pomoca hashfunkcji
        Set<String> uniqueNames = new HashSet<>(List.of("Ola", "Adam", "Ala", "Ola"));
        System.out.println(uniqueNames);
        HashSet<String> hashSet = new HashSet<>(List.of("Ola", "Adam", "Ala", "Ola"));
        System.out.println(hashSet);
    }
}
