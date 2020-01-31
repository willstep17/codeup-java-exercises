package shapes;
import util.Input;

import java.util.Scanner;

public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();
        do {
            Circle circle = new Circle(input.getDouble("Enter a double radius: "));
            System.out.println("Area: " + circle.getArea());
            System.out.println("Circumference: " + circle.getCircumference());
            System.out.println("");
            input = new Input();
        } while (input.yesNo("Would you like to make another circle? "));

        Circle.circleStatistics();
    }
}
