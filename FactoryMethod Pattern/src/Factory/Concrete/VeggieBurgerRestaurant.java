package Factory.Concrete;

import Factory.Abstract.AbstractRestaurant;
import Product.Abstract.Burger;
import Product.Concrete.VeggieBurger;

public class VeggieBurgerRestaurant extends AbstractRestaurant {
    @Override
    public Burger createBurger() {
        return new VeggieBurger();
    }
}
