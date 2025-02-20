package parking;

public class Trash implements Parkingable {
    @Override
    public void park(final Parking parking) {
        System.out.println("La benne est garée");
    }

    @Override
    public String getName() {
        return "Benne à ordure";
    }
}
