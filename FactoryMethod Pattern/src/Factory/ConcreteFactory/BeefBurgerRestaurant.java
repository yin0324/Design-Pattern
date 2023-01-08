package Factory.ConcreteFactory;

import Factory.AbstractFactory.AbstractRestaurant;
import Product.AbstractProduct.Burger;
import Product.ConcreteProduct.BeefBurger;

public class BeefBurgerRestaurant extends AbstractRestaurant {
    @Override
    public Burger createBurger() {
        return new BeefBurger();
    }
}
