package vehicle;

public class VehicleApp {
    public static void main(String[] args) {
        Vehicle[] garage = new Vehicle[3];
        Vehicle vehicle = new Car();
        Helicopter heli = new Helicopter();
        Vehicle heli2 = new Helicopter();
        vehicle.go(34);
        garage[0] = heli;
        garage[1] = heli2;

        heli.fly();
//        heli2.fly(); //Can't use this method because heli2 is declared as a Vehicle.
    }
}
