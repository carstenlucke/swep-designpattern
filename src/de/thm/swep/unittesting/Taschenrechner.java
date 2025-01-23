package de.thm.swep.unittesting;

public class Taschenrechner {
    public double addieren(double a, double b) {
        return a + b;
    }

    public double subtrahieren(double a, double b) {
        return a - b;
    }

    public double multiplizieren(double a, double b) {
        return a * b;
    }

    public double dividieren(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division durch Null");
        }
        return a / b;
    }
}
