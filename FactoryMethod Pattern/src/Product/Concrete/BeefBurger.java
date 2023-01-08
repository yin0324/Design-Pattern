package Product.Concrete;

import Product.Abstract.Burger;

public class BeefBurger extends Burger {
    @Override
    public void prepare() {
        System.out.println("Preparing BeefBurger");
    }

    public BeefBurger() {
        System.out.println("Creating BeefBurger");
    }
}
