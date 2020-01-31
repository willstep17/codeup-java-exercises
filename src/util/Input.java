package util;
import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        scanner = new Scanner(System.in);
    }

    public String getString() {
        System.out.print("Enter a String: ");
        return scanner.nextLine();
    }

    public boolean yesNo() {
        System.out.print("(y/n): ");
        String userInput = scanner.nextLine();
        userInput = userInput.toLowerCase();
        if(userInput.equals("yes") || userInput.equals("y")) {
            return true;
        } else {
            return false;
        }
    }

    public int getInt(int min, int max) {
        while (true) {
            System.out.print("Enter an integer between " + min + " and " + max + ": ");
            int userInput = scanner.nextInt();
            if(userInput > min && userInput < max) {
                return userInput;
            }
        }
    }

    public int getInt() {
        System.out.print("Enter an integer: ");
        int userInput = scanner.nextInt();
        return userInput;
    }

    public double getDouble(double min, double max) {
        while (true) {
            System.out.print("Enter a double between " + min + " and " + max + ": ");
            double userInput = scanner.nextDouble();
            if(userInput > min && userInput < max) {
                return userInput;
            }
        }
    }

    public double getDouble() {
        System.out.print("Enter a double: ");
        double userInput = scanner.nextDouble();
        return userInput;
    }
}
