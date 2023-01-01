package Component.Concrete;

import Component.Beverage;

public class Tea extends Beverage {
    public Tea(String description) {
        this.setDescription("Tea");
    }
    @Override
    public int cost() {
        return 15;
    }
}
