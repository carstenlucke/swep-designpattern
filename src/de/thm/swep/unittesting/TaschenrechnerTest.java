package de.thm.swep.unittesting;

import org.junit.Test;

import static org.junit.Assert.*;

public class TaschenrechnerTest {
    private Taschenrechner calculator = new Taschenrechner();

    @Test
    public void testAddieren() {
        double result = calculator.addieren(1, 1);
        assertEquals(2, result, 0);
    }

    @Test
    public void testSubtrahieren() {
        double result = calculator.subtrahieren(3, 1);
        assertEquals(2, result, 0);
    }

    @Test
    public void testMultiplizieren() {
        double result = calculator.multiplizieren(2, 3);
        assertEquals(6, result, 0);
    }

    @Test
    public void testDividieren() {
        double result = calculator.dividieren(8, 4);
        assertEquals(2, result, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDividierenDurchNull() {
        calculator.dividieren(8, 0);
    }
}
