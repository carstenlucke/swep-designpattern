package de.thm.swep.simucharacter;

import de.thm.swep.simucharacter.characters.King;
import de.thm.swep.simucharacter.characters.Knight;
import de.thm.swep.simucharacter.characters.Queen;
import de.thm.swep.simucharacter.characters.Troll;

public class Main {

    public static void main(String[] args) {
        _fight(new King());
        _fight(new Queen());
        _fight(new Knight());
        _fight(new Troll());
    }

    private static void _fight(Character c) {
        System.out.printf("%s kämpt: ", c.getClass().toString());
        c.fight();
    }
}
