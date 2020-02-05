package vehicle;

public interface Vehicle {
    void go(int miles); //Abstract methods are only the method signature. Forces every extending class to implement this method.
    void method1();
    void method2(int num);
    int method3(String message);
}
