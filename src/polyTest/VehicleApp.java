package polyTest;

public class VehicleApp {
    public static void main(String[] args) {
        Vehicle myCar = new Car(23);
        Vehicle myMotorcycle = new Motorcycle(2);

        myCar.turnOn();
        myMotorcycle.turnOn();
    }
}
