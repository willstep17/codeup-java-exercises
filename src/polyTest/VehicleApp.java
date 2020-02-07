package polyTest;

public class VehicleApp {
    public static void main(String[] args) {
        Vehicle[] garage = new Vehicle[6];

        Vehicle myCar = new Car(23);
        Vehicle myMotorcycle = new Motorcycle(2);
        Car myOtherCar = new Car(23);

        garage[0] = myOtherCar;

        myCar.turnOn();
        myMotorcycle.turnOn();
    }
}
