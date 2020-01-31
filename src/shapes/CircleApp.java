package shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();
        do {
            double radius = input.getDouble("Enter a double radius: ");
            Circle circle = new Circle(radius);
            System.out.println("Area: " + circle.getArea());
            System.out.println("Circumference: " + circle.getCircumference());
        } while (input.yesNo("\nWould you like to create another circle? "));

        Circle.circleStatistics();
    }
}
