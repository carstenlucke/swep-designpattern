package de.thm.swep.simucharacter;

import de.thm.swep.simucharacter.behaviors.weapon.WeaponBehavior;

public class Character {

    protected WeaponBehavior weaponBehavior;

    public void fight() {
        weaponBehavior.useWeapon();
    }
}
