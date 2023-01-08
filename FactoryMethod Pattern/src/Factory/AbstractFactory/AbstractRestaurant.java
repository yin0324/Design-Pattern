package Factory.AbstractFactory;

import Product.AbstractProduct.Burger;

public abstract class AbstractRestaurant {

    public Burger orderBurger() {
        Burger burger = createBurger();
        burger.prepare();
        return burger;
    }
    public abstract Burger createBurger();
}
