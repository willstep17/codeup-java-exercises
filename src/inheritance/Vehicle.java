package inheritance;

public class Vehicle {
    int numberOfTires;

    public Vehicle(int numberOfTires) {
        this.numberOfTires = numberOfTires;
    }

    public void go() {
        System.out.println("Vehicle: Here we go!");
    }

    public void report() {
        System.out.println("I have " + this.numberOfTires + " tires.");
    }

    public final void finalReport() {
        System.out.println("This is a method on parent Vehicle class that is final and cannot be redeclared.");
    }
}
