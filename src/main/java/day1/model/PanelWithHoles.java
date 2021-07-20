package day1.model;

import java.math.BigDecimal;

public class PanelWithHoles extends Panel{
    public final static BigDecimal HOLE_PRICE = BigDecimal.TEN;
    private int numberOfHoles;

    public PanelWithHoles(int width, int height, int numberOfHoles) {
        super(width, height);
        this.numberOfHoles = numberOfHoles;
    }

    public int getNumberOfHoles() {
        return numberOfHoles;
    }

    @Override
    public BigDecimal price(BigDecimal priceUnit) {
        return super.price(priceUnit).add(BigDecimal.valueOf(numberOfHoles).multiply(HOLE_PRICE));
    }

    @Override
    public String toString() {
        return "PanelWithHoles{" +
                "numberOfHoles=" + numberOfHoles +
                "} " + super.toString();
    }
}
