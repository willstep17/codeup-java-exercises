package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        System.out.print("Enter a string: ");
        return this.scanner.nextLine();
    }

    public String getString(String prompt) {
        System.out.print(prompt);
        return this.scanner.nextLine();
    }

    public boolean yesNo() {
        System.out.print("Yes or No? ");
        String userInput = this.scanner.next();
        return userInput.toLowerCase().startsWith("y");
    }

    public boolean yesNo(String prompt) {
        System.out.print(prompt);
        String userInput = this.scanner.next();
        return userInput.toLowerCase().startsWith("y");
    }

    public int getInt(int min, int max) {
        int userInput;
        do {
            System.out.print("Enter an int between " + min + " and " + max + ": ");
            userInput = this.scanner.nextInt();
        } while (min >= userInput && userInput <= max);
        return userInput;
    }

    public int getInt() {
        System.out.print("Enter an integer: ");
        return this.scanner.nextInt();
    }

    public int getInt(String prompt) {
        System.out.print(prompt);
        return this.scanner.nextInt();
    }

    public double getDouble(double min, double max) {
        double userInput;
        do {
            System.out.print("Enter a double between " + min + " and " + max + ": ");
            userInput = this.scanner.nextDouble();
        } while (min >= userInput && userInput <= max);
        return userInput;
    }

    public double getDouble() {
        System.out.print("Enter a double: ");
        return this.scanner.nextDouble();
    }

    public double getDouble(String prompt) {
        System.out.print(prompt);
        return this.scanner.nextDouble();
    }
}
