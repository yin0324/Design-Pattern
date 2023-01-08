package Factory.ConcreteFactory;

import Factory.AbstractFactory.AbstractRestaurant;
import Product.AbstractProduct.Burger;
import Product.ConcreteProduct.VeggieBurger;

public class VeggieBurgerRestaurant extends AbstractRestaurant {
    @Override
    public Burger createBurger() {
        return new VeggieBurger();
    }
}
