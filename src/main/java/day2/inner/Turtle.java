package day2.inner;

public class Turtle {
    public static class Egg {
        private double weight;
        public Egg(double weight) {
            this.weight = weight;
        }

        public Egg getEgg(double weight) {
            Egg egg = new Egg(weight);
            egg.weight = 140;
            return egg;
        }

    }
}
