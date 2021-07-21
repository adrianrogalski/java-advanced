package day2.app;

import day2.inner.HumanBody;

public class HumanBodyDemo {
    public static void main(String[] args) {
        HumanBody body = new HumanBody(56);
        // Aby stworzyć obiekt serce musze mieć najpierw obiekt body(rzadko stosowane) o ile klasa serce nie jest prywatna
        HumanBody.Heart heart = body.new Heart();
    }
}
