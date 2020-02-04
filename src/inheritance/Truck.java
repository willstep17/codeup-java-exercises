package inheritance;

public class Truck extends Vehicle {

    public Truck() {
        super(4);
    }

    public void go() {
        System.out.println("VROOOOOOOOMMM! Truck overriding parent behavior for go() method");
    }


}
