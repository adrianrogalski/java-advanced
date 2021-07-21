package day2.inner;

public class Chicken {

     public static class Egg {
        private double weight;

         public double getWeight() {
             return weight;
         }

         // dodaje slowo private do konstruktora jajka aby jedynym uprawionym do tworzenia jajka byl kurcask
        private Egg(double weight) {
            this.weight = weight;
        }
    }

    public Egg getEgg() {
        Egg egg = new  Egg(45);
        egg.weight = 100;
        return egg;
    }
}
