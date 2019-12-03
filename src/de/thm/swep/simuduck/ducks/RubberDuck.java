package de.thm.swep.simuduck.ducks;

import de.thm.swep.simuduck.Duck;
import de.thm.swep.simuduck.behaviors.fly.FlyNoWay;
import de.thm.swep.simuduck.behaviors.quack.Squeak;

public class RubberDuck extends Duck {

    public RubberDuck() {
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("Eine Gummiente: ");
        System.out.println("       __");
        System.out.println("   ___( o)>");
        System.out.println("   \\ <_. )");
        System.out.println("    `---'");
    }
}
