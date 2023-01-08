package Factory.Abstract;

import Product.Abstract.Burger;

public abstract class AbstractRestaurant {

    public Burger orderBurger() {
        Burger burger = createBurger();
        burger.prepare();
        return burger;
    }
    public abstract Burger createBurger();
}
