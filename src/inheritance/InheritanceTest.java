package inheritance;

public class InheritanceTest {
    public static void main(String[] args) {
        Vehicle[] garage = new Vehicle[4];

        Vehicle vehicleOne = new Vehicle(5);
        vehicleOne.numberOfTires = 1;
//        vehicleOne.go();
//        vehicleOne.report();
        garage[0] = vehicleOne; //Fits in Vehicle garage[] because it is a vehicle

        Car carOne = new Car();
//        carOne.go();
//        carOne.report();
        garage[1] = carOne; //Knows it is a vehicle. Polymorphism.

        Vehicle truckOne = new Truck();
//        truckOne.go();
//        truckOne.report();
        garage[2] = truckOne;

        Motorcycle motoOne = new Motorcycle();
//        motoOne.go();
//        motoOne.report();
        garage[3] = motoOne;

        for(Vehicle veh : garage) {
            veh.go();
            veh.report();
            if(veh instanceof Vehicle) {
                System.out.println("I am a Vehicle");
            }
            if(veh instanceof Car) {
                System.out.println("I am also a car");
            }
        }


    }
}
