package Factory.Concrete;

import Factory.Abstract.AbstractRestaurant;
import Product.Abstract.Burger;
import Product.Concrete.BeefBurger;

public class BeefBurgerRestaurant extends AbstractRestaurant {
    @Override
    public Burger createBurger() {
        return new BeefBurger();
    }
}
