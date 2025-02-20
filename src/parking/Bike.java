package parking;

public class Bike extends Vehicle implements Parkingable {
    public Bike() {
        super("Vélo");
    }

    @Override
    public void park(final Parking parking) {
        System.out.println("Le vélo se range");
    }
}
