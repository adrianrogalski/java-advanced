package day2.enumType;

public enum CardColor {
    // Stałe wyliczeniowe maja pojawic sie jako pierwsze
    // kolory kart
    // final static public CardColor DIAMOND = new CardColor(40, "Dzwonek")
    // dzieki temu nie potrzebuje switcha
    DIAMOND(40, "Karo"), HEART(50, "Kier"),SPADES(50, "Pik"), CLUB(20, "Trefl");

    private final int points;
    private final String polishName;

    CardColor(int points, String polishName) {
        this.points = points;
        this.polishName = polishName;
    }

    public int getPoints() {
        return points;
    }

    public String getPolishName() {
        return polishName;
    }
}
