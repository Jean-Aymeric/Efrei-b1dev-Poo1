package dice;

public class D20 extends Dice {
    public D20() {
        super(20);
    }

    @Override
    public final void makeNoise() {
        System.out.println("Je fais du bruit comme un dé 20");
    }
}
