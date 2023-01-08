package Product.ConcreteProduct;

import Product.AbstractProduct.Burger;

public class VeggieBurger extends Burger {
    @Override
    public void prepare() {
        System.out.println("Preparing VeggieBurger");
    }

    public VeggieBurger() {
        System.out.println("Creating VeggieBurger");
    }

}
