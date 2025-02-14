package dice;

public class Coin extends Dice {
    private double value;

    public Coin(double value) {
        super(2);
    }

    public double getValue() {
        return this.value;
    }

    @Override
    public void makeNoise() {

    }
}
