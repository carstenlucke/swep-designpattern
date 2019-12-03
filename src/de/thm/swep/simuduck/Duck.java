package de.thm.swep.simuduck;

import de.thm.swep.simuduck.behaviors.fly.FlyBehavior;
import de.thm.swep.simuduck.behaviors.quack.QuackBehavior;

abstract public class Duck {
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;



    abstract public void display();


    public void swim() {
        System.out.println("Schwimm ... schwimm.");
    }



    void performQuack() {
        quackBehavior.quack();
    }

    void performFly() {
        flyBehavior.fly();
    }
}
