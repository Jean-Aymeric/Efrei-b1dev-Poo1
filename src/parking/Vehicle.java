package parking;

public abstract class Vehicle implements Named {
    private final String name;

    protected Vehicle(final String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
