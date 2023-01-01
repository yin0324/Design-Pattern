package Decorator.Concrete;

import Component.Beverage;
import Decorator.AddOnDecorator;

public class SoyMilkDecorator extends AddOnDecorator {
    Beverage beverage;
    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", SoyMilk ";
    }

    @Override
    public int cost() {
        return this.beverage.cost() + 5;
    }

    public SoyMilkDecorator(Beverage beverage) {
        this.beverage = beverage;
    }
}
