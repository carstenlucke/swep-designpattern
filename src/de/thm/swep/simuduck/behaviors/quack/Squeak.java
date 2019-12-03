package de.thm.swep.simuduck.behaviors.quack;

public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Quieeeetsch. Squeeeaaak.");
    }
}
