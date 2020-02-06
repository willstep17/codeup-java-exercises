package polyTest;

public class Motorcycle extends Vehicle {
    public Motorcycle(int inputNumberOfWheels) {
        super(inputNumberOfWheels);
    }

    public void turnOn() {
        System.out.println("I'm a vehicle, but this method has been overriden in the Motorcycle class");
    }
}
