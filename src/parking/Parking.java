package parking;

import java.util.ArrayList;
import java.util.List;

public class Parking {
    private final List<Parkingable> vehicles = new ArrayList<>();

    public void addVehicle(Parkingable vehicle) {
        this.vehicles.add(vehicle);
        vehicle.park(this);
    }

    public String ToPrettyString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Parkingable vehicle : this.vehicles) {
            stringBuilder.append(vehicle.getName()).append(", ");
        }
        return stringBuilder.toString();
    }
}
