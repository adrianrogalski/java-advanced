package day3;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class BirthDayApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz date urodzin");
        String birth = scanner.next();
        try {
            LocalDate localDate = LocalDate.parse(birth);
        }
        catch (DateTimeParseException exception) {
            System.out.println("Niepoprwany format daty");
        }

    }
}
