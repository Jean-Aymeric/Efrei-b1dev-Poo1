package foo1;

public class Baz extends Foo {
    public Baz() {
        super("Baz");
    }


    @Override
    protected void doSomethingExtented() {
        System.out.println("je fais un truc en plus a la mode baz");
    }
}
