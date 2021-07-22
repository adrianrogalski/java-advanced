package day3;

import java.util.Scanner;

public class ExceptionDemo {
    static class Result {
        int number;
        int remainder;

        @Override
        public String toString() {
            return "Wynik dzielenia " + number + " i reszta " + remainder;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz licznik");
        int a  = scanner.nextInt();
        System.out.println("Wpisz mianownik");
        int b = scanner.nextInt();
        try {
            System.out.println(divide(a,b));
        }
        catch (ArithmeticException exception) {
            System.out.println("Nie można dzielić przez zero!");
            System.out.println("Wyjątek: " + exception.getMessage());
        }
    }

    public static Result divide(int a, int b) {
        Result result = new Result();
        result.number = a / b;
        result.remainder = a % b;
        return result;
    }

}
