package de.thm.swep.simucharacter.behaviors.weapon;

public class BowAndArrowBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Schießt mit Pfeil und Bogen.");
    }
}
