package foo1;

public class Bar extends Foo {

    protected String anotherThing;

    public Bar(String aThing, String anotherThing) {
        super(aThing);
        this.anotherThing = anotherThing;

    }

    @Override
    protected void doSomethingExtented() {
        System.out.println("je fais un truc en plus a la mode bar");
    }
}
