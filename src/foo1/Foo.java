package foo1;

public abstract class Foo {
    public static final String madeBy = "JAD";
    private String aThing;
    private String anotherThing;

    public Foo(String aThing) {
        this.aThing = aThing;
    }

    public static int doStaticSomething() {
        return 18;
    }

    public String getaThing() {
        return this.aThing;
    }

    public void setaThing(final String aThing) {
        this.aThing = aThing;
    }

    public String getAnotherThing() {
        return this.anotherThing;
    }

    public void setAnotherThing(final String anotherThing) {
        this.anotherThing = anotherThing;
    }

    public void doSomething() {
        System.out.println("je fais un truc");
        this.doSomethingExtented();
    }

    protected abstract void doSomethingExtented();

    private String doSomethingInternally() {
        return "cocouc";
    }


}
