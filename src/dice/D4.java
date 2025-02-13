package dice;

public class D4 extends Dice {
    public D4() {
        super(4);
    }

    @Override
    public final void makeNoise() {
        System.out.println("Je fais du bruit comme un dé 4");
    }
}
