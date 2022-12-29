import Behaviour.flying.JetFlying;
import Behaviour.flying.SimpleFlying;
import Interface.IFlyingBehaviour;
import Model.duck.CityDuck;
import Model.duck.MountainDuck;

public class Main {
    public static void main(String[] args) {
        IFlyingBehaviour flyingBehaviour = new SimpleFlying();
        CityDuck cityDuck = new CityDuck(flyingBehaviour);
        cityDuck.fly();

        flyingBehaviour = new JetFlying();
        MountainDuck mountainDuck = new MountainDuck(flyingBehaviour);
        mountainDuck.fly();
    }
}