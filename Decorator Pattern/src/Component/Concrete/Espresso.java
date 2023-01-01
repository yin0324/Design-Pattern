package Component.Concrete;

import Component.Beverage;

public class Espresso extends Beverage {
    public Espresso() {
        this.setDescription("Espresso");
    }
    @Override
    public int cost() {
        return 10;
    }
}
