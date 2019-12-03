package de.thm.swep.simucharacter.characters;

import de.thm.swep.simucharacter.Character;
import de.thm.swep.simucharacter.behaviors.weapon.KnifeBehavior;

public class Queen extends Character {

    public Queen() {
        weaponBehavior = new KnifeBehavior();
    }
}
