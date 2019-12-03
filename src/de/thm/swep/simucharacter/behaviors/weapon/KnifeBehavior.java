package de.thm.swep.simucharacter.behaviors.weapon;

public class KnifeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Schneidet mit Messer.");
    }
}
