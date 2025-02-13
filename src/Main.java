import dice.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Dice> diceBag = new ArrayList<>();
        Dice myCoin = new Coin(1.0);
        Dice aDice = new Dice(30);
        diceBag.add(new D6());
        diceBag.add(new D4());
        diceBag.add(myCoin);
        diceBag.add(new D20());
        diceBag.add(new TrickD6());
        for (Dice dice : diceBag) {
            dice.makeNoise();
            System.out.println(dice.getNbSides() + ":" + dice.roll(2));
        }
    }
}