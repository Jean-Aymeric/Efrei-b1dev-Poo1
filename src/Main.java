import foo1.Bar;
import foo1.Baz;

public class Main {
    public static void main(String[] args) {
        Bar bar = new Bar("toto", "titi");
        Baz baz = new Baz();
        bar.doSomething();
        baz.doSomething();
    }
}