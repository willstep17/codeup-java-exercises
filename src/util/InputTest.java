package util;

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();
        System.out.println(input.getString());
        System.out.println(input.yesNo());
        System.out.println(input.getInt(5, 10));
        System.out.println(input.getInt());
        System.out.println(input.getDouble(40.34, 75.2));
        System.out.println(input.getDouble());
    }
}
