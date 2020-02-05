package vehicle;

public class Helicopter implements Vehicle {
    public void fly() {
        System.out.println("Flying");
    }

    @Override
    public void go(int miles) {
        System.out.println("chopchopchop");
    }

    @Override
    public void method1() {

    }

    @Override
    public void method2(int num) {

    }

    @Override
    public int method3(String message) {
        return 0;
    }
}
