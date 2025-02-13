import dice.D6;

public class Main {
    public static void main(String[] args) {
        D6 d6 = new D6();
        System.out.println(d6);
        for (int i = 0; i < 10; i++) {
            System.out.println(d6.roll(3));
        }
    }
}