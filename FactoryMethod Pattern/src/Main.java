import Factory.ConcreteFactory.BeefBurgerRestaurant;
import Factory.ConcreteFactory.VeggieBurgerRestaurant;

public class Main {
    public static void main(String[] args) {
        BeefBurgerRestaurant beefBurgerRestaurant = new BeefBurgerRestaurant();
        beefBurgerRestaurant.orderBurger();

        VeggieBurgerRestaurant veggieBurgerRestaurant = new VeggieBurgerRestaurant();
        veggieBurgerRestaurant.orderBurger();
    }
}