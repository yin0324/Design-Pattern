import Component.Beverage;
import Component.Concrete.Tea;
import Decorator.Concrete.MochaDecorator;
import Decorator.Concrete.SoyMilkDecorator;

public class Main {
    public static void main(String[] args) {
        Beverage beverage = new Tea("Tea");
        System.out.println("Tea cost " + beverage.cost());

        beverage = new SoyMilkDecorator(beverage);
        System.out.println("Beverage " + beverage.getDescription() + "and Cost " + beverage.cost());
        beverage = new MochaDecorator(beverage);
        System.out.println("Beverage " + beverage.getDescription() + "and Cost " + beverage.cost());

    }
}