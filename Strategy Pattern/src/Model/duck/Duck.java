package Model.duck;

import Interface.IFlyingBehaviour;

public class Duck {
    private IFlyingBehaviour flyingBehaviour;

    public Duck(IFlyingBehaviour flyingBehaviour) {
        this.flyingBehaviour = flyingBehaviour;
    }

    public void fly() {
        this.flyingBehaviour.fly();
    }

}
