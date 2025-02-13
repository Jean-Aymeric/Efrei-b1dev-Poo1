package dice;

import java.util.Objects;
import java.util.Random;

public class Dice {
    private int nbSides;

    public Dice(int nbSides) {
        this.setNbSides(nbSides);
    }

    public int roll(int nbRolls) {
        int result = 0;
        for (int i = 0; i < nbRolls; i++) {
            result += this.roll();
        }
        return result;
    }

    public int roll() {
        return new Random().nextInt(this.nbSides) + 1;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.nbSides);
    }

    @Override
    public boolean equals(final Object o) {
        if (o == null || this.getClass() != o.getClass()) return false;
        final Dice dice = (Dice) o;
        return this.nbSides == dice.nbSides;
    }

    @Override
    public String toString() {
        return "Dice{" +
                "nbSides=" + getNbSides() +
                '}';
    }

    public int getNbSides() {
        return this.nbSides;
    }

    private void setNbSides(final int nbSides) {
        this.nbSides = Math.max(2, nbSides);
    }
}