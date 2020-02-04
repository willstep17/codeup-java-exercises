package inheritance;

//Final keyword means Motorcycle cannot have a subclass
public final class Motorcycle extends Vehicle {

    public Motorcycle() {
        super(2);
    }

    public void report() {
        System.out.println("I am a motorcycle! Motorcycle overriding parent behavior for report()");
    }

}
