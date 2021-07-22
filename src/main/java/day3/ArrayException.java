package day3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayException {
    public static void main(String[] args) {
        String[] names = {"Ala", "Ola", "Karol"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz numer imienia");
        // obsluge blkedow przekazuje klientowi czyli kodzie ktory wowluje polecenie wywolujace blad
        try {
            int index = scanner.nextInt();
            System.out.println(names[index]);
        }
        catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Brak imienia o takim indeksie");
        }
        // druga możliwość zamiast .hasNextInt() dla scannera
        catch (InputMismatchException exception) {
            System.out.println("Nie wpisałeś poprawnie liczby całkowitej!");
        }

    }
}
