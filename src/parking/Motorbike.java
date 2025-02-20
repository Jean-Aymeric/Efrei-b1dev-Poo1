package parking;

public class Motorbike extends Vehicle implements Parkingable {
    public Motorbike() {
        super("Moto");
    }

    @Override
    public void park(final Parking parking) {
        System.out.println("La moto se gare");
    }
}
