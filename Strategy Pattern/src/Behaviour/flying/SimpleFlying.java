package Behaviour.flying;

import Interface.IFlyingBehaviour;

public class SimpleFlying implements IFlyingBehaviour {
    @Override
    public void fly() {
        System.out.println("Simple flying");
    }
}
