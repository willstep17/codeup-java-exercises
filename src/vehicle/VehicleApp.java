package vehicle;

public class VehicleApp {
    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        vehicle.go(); //go method overridden in car
    }
}
