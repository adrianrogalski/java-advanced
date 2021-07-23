package day3;

// Boks generyczny bedzie przyjmował obiekty tylko Pizza oraz jej pochodne
public class PizzaBox <T extends Pizza> {
    private T pizza;

    public PizzaBox(T pizza) {
        this.pizza = pizza;
    }

    public T getPizza() {
        return pizza;
    }

    public void setPizza(T pizza) {
        this.pizza = pizza;
    }
}
