package vehicle;

public class Car implements Vehicle {
    public void go(int miles) {
        System.out.println("Go (from Car) for " + miles + " miles.");
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
