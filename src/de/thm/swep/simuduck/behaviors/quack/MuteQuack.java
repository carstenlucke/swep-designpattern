package de.thm.swep.simuduck.behaviors.quack;

public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Stille. Diese Ente quakt nicht.");
    }
}

