package de.thm.swep.simucharacter.characters;

import de.thm.swep.simucharacter.Character;
import de.thm.swep.simucharacter.behaviors.weapon.BowAndArrowBehavior;

public class King extends Character {

    public King() {
        weaponBehavior = new BowAndArrowBehavior();
    }
}
