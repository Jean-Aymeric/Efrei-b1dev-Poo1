package dice;

public class D6 extends Dice {
    public D6() {
        super(6);
    }

    @Override
    public final void makeNoise() {
        System.out.println("Je fais du bruit comme un dé 6");
    }
}
