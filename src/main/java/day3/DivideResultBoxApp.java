package day3;

import java.util.Scanner;

class Result {
    int fraction;
    int reminder;
}

public class DivideResultBoxApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz licznik");
        int a  = scanner.nextInt();
        System.out.println("Wpisz mianownik");
        int b = scanner.nextInt();
        GenericBox<Result> genericBox = divide(a,b);
        if (genericBox.isPresent()) {
            Result result = new Result();
            System.out.println(result.fraction + " " + result.reminder);
        }
        else {
            System.out.println("Nie udało się uzyskać wyników");
        }
    }

    // Zamiast zgłaszać wyjątek zwracam opakowanie na wynik kiedy nie musze używać wyjątków(nie potrzebna jest informacja skąd pochodzi) oraz
    // ze względu na ogromny stacktrace jaki genruja
    //
    public static GenericBox<Result> divide(int a, int b) {
        if (b == 0) {
            return new GenericBox<>(0, null);
        }
        Result result = new Result();
        result.fraction = a / b;
        result.reminder = a % b;
        return new GenericBox<>(0,result);
    }
}
