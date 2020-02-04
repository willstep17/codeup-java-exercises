package inheritance;

public class InheritanceTest {
    public static void main(String[] args) {
        Vehicle[] garage = new Vehicle[4];

        Vehicle vehicleOne = new Vehicle(5);
        vehicleOne.numberOfTires = 1;
        vehicleOne.go();
        vehicleOne.report();
        garage[0] = vehicleOne; //Fits in Vehicle garage[] because it is a vehicle

        Car carOne = new Car();
        carOne.go();
        carOne.report();
        garage[1] = carOne; //Knows it is a vehicle. Polymorphism.

        Truck truckOne = new Truck();
        truckOne.go();
        truckOne.report();
        garage[2] = truckOne;

        Motorcycle motoOne = new Motorcycle();
        motoOne.go();
        motoOne.report();
        garage[3] = motoOne;


    }
}
