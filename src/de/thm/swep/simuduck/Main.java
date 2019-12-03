package de.thm.swep.simuduck;

import de.thm.swep.simuduck.ducks.DecoyDuck;
import de.thm.swep.simuduck.ducks.MallardDuck;
import de.thm.swep.simuduck.ducks.RedheadDuck;
import de.thm.swep.simuduck.ducks.RubberDuck;

public class Main {

    public static void main(String[] args) {

        System.out.println("SimUDuck startet.");
        _spacing(2);


        Duck d = new DecoyDuck();
        _display(d);
        _swim(d);
        _fly(d);
        _quack(d);
        _spacing(2);


        d = new RubberDuck();
        _display(d);
        _swim(d);
        _fly(d);
        _quack(d);
        _spacing(2);


        d = new MallardDuck();
        _display(d);
        _swim(d);
        _fly(d);
        _quack(d);
        _spacing(2);


        d = new RedheadDuck();
        _display(d);
        _swim(d);
        _fly(d);
        _quack(d);
        _spacing(2);


    }

    private static void _swim(Duck d) {
        System.out.printf("Die Ente schwimmt:  ");
        d.swim();
    }

    private static void _display(Duck d) {
        d.display();
    }

    private static void _fly(Duck d) {
        System.out.printf("Die Ente fliegt:  ");
        d.performFly();
    }

    private static void _quack(Duck d) {
        System.out.printf("Die Ente quakt:  ");
        d.performQuack();
    }

    private static void _spacing(int n) {
        for (int i=0; i<n; ++i) {
            System.out.println();
        }
    }
}
