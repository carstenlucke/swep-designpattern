package de.thm.swep.simucharacter.characters;

import de.thm.swep.simucharacter.Character;
import de.thm.swep.simucharacter.behaviors.weapon.AxeBehavior;

public class Troll extends Character {

    public Troll() {
        weaponBehavior = new AxeBehavior();
    }
}
