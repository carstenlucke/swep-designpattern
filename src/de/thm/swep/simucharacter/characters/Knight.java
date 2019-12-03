package de.thm.swep.simucharacter.characters;

import de.thm.swep.simucharacter.Character;
import de.thm.swep.simucharacter.behaviors.weapon.SwordBehavior;

public class Knight extends Character {

    public Knight() {
        weaponBehavior = new SwordBehavior();
    }
}
