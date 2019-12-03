package de.thm.swep.simucharacter.behaviors.weapon;

public class SwordBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Schwingt das Schwert.");
    }
}
