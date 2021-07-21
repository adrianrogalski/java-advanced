package day2.inner;

public class HumanBody {
    private Heart heart;

    public HumanBody(int capacity) {
        this.heart = new Heart();
        heart.capacity = capacity;
    }

    // wewnetrzna klasa niestatyczna
    public class Heart {
        private int capacity;
    }

    // pomimo pola prywatnego klasy heart moge dostac sie do niego
    public void describe() {
        System.out.println("Serce o pojemnosci: " + heart.capacity);
    }
}
