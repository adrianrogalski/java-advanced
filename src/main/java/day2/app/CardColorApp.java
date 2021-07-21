package day2.app;

import day2.enumType.CardColor;

import java.util.Scanner;

public class CardColorApp {
    public static void main(String[] args) {
        CardColor cardColor = CardColor.CLUB;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz kolor karty: ");
        String color = scanner.next();
        /*
        switch(color) {
            case "heart":
                cardColor = CardCard.HEART;
                break;
                ....
         */
        // W typach enum moge porownywac za pomoca ==


        System.out.println(CardColor.CLUB == cardColor);
//        switch (cardColor) {
//            case HEART:
//                System.out.println("Punkty " + 40);
//                break;
//            case SPADES:
//                System.out.println("Punkty " + 50);
//                break;
//            case CLUB:
//                System.out.println("Punkty " + 60);
//                break;
//        }


    }
}
