package polyTest;

public class Car extends Vehicle {
    public Car(int inputNumberOfWheels) {
        super(inputNumberOfWheels);
    }

    public void turnOn() {
        System.out.println("I'm a vehicle, but this method has been overriden in the Car class");
    }
}
