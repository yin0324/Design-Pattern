package Product.ConcreteProduct;

import Product.AbstractProduct.Burger;

public class BeefBurger extends Burger {
    @Override
    public void prepare() {
        System.out.println("Preparing BeefBurger");
    }

    public BeefBurger() {
        System.out.println("Creating BeefBurger");
    }
}
