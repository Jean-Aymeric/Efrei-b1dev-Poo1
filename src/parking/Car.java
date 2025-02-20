package parking;

public class Car extends Vehicle implements Parkingable {
    public Car() {
        super("Voiture");
    }

    @Override
    public void park(final Parking parking) {
        System.out.println("Je me gare");
    }
}
