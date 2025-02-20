import parking.*;

public class Main {
    public static void main(String[] args) {
        Parking myParking = new Parking();
        Car myCar = new Car();
        Bike myBike = new Bike();
        Tank myTank = new Tank();
        Motorbike myMoto = new Motorbike();
        Trash myTrash = new Trash();
        myParking.addVehicle(myBike);
        myParking.addVehicle(myCar);
        myParking.addVehicle(myMoto);
        myParking.addVehicle(myTrash);
        System.out.println(myParking.ToPrettyString());
    }
}