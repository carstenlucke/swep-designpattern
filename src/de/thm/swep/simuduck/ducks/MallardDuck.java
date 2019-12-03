package de.thm.swep.simuduck.ducks;

import de.thm.swep.simuduck.Duck;
import de.thm.swep.simuduck.behaviors.fly.FlyWithWings;
import de.thm.swep.simuduck.behaviors.quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("Eine Stockente.");
    }
}
