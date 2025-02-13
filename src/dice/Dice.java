package dice;

import java.util.Objects;
import java.util.Random;

public abstract class Dice {
    private int nbSides;

    public Dice(int nbSides) {
        this.setNbSides(nbSides);
    }

    public final int roll(int nbRolls) {
        int result = 0;
        for (int i = 0; i < nbRolls; i++) {
            result += this.roll();
        }
        return result;
    }

    public final int roll() {
        return new Random().nextInt(this.nbSides) + 1;
    }

    @Override
    public final int hashCode() {
        return Objects.hashCode(this.nbSides);
    }

    @Override
    public final boolean equals(final Object o) {
        if (o == null || this.getClass() != o.getClass()) return false;
        final Dice dice = (Dice) o;
        return this.nbSides == dice.nbSides;
    }

    @Override
    public final String toString() {
        return "Dice{" +
                "nbSides=" + getNbSides() +
                '}';
    }

    public final int getNbSides() {
        return this.nbSides;
    }

    private final void setNbSides(final int nbSides) {
        this.nbSides = Math.max(2, nbSides);
    }

    public abstract void makeNoise();
}