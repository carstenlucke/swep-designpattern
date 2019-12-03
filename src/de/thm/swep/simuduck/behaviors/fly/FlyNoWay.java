package de.thm.swep.simuduck.behaviors.fly;

public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Nichts passiert. Diese Ente fliegt nicht.");
    }
}
