package polyTest;

public abstract class Vehicle {
    private int numberOfWheels;

    public Vehicle(int inputNumberOfWheels) {
        this.numberOfWheels = inputNumberOfWheels;
    }

    public abstract void turnOn();
}
