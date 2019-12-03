package de.thm.swep.simuduck.ducks;

import de.thm.swep.simuduck.Duck;
import de.thm.swep.simuduck.behaviors.fly.FlyNoWay;
import de.thm.swep.simuduck.behaviors.quack.MuteQuack;

public class DecoyDuck extends Duck {

    public DecoyDuck() {
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("Eine Köderente.");
    }
}
