package inheritance;

public class InheritanceTest {
    public static void main(String[] args) {
        Vehicle vehicleOne = new Vehicle(5);
        vehicleOne.go();
        vehicleOne.report();

        Car carOne = new Car();
        carOne.go();
        carOne.report();

        Truck truckOne = new Truck();
        truckOne.go();
        truckOne.report();

        Motorcycle motoOne = new Motorcycle();
        motoOne.go();
        motoOne.report();
    }
}
