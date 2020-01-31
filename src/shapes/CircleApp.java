package shapes;
import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();
        do {
            Circle circle = new Circle(input.getDouble("Enter a double radius: "));
            System.out.println("Area: " + circle.getArea());
            System.out.println("Circumference: " + circle.getCircumference());
            input = new Input();
        } while (input.yesNo("\nWould you like to make another circle? "));

        Circle.circleStatistics();
    }
}
