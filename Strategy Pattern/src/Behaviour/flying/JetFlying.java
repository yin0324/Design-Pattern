package Behaviour.flying;

import Interface.IFlyingBehaviour;

public class JetFlying implements IFlyingBehaviour {
    @Override
    public void fly() {
        System.out.println("JetFlying!");
    }
}
