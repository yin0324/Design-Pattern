package Decorator.Concrete;

import Component.Beverage;
import Decorator.AddOnDecorator;

public class MochaDecorator extends AddOnDecorator {
    Beverage beverage;
    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Mocha ";
    }

    @Override
    public int cost() {
        return this.beverage.cost() + 3;
    }

    public MochaDecorator(Beverage beverage) {
        this.beverage = beverage;
    }
}
