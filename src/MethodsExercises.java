import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {

//        System.out.println(add(2, 4));
//        System.out.println(subtract(3, 1));
//        System.out.println(multiply(4, 5));
//        System.out.println(divide(15, 5));
//        System.out.println(modulus(27, 6));

//        System.out.println(multiplyWithoutMultiplying(3,7));

//        System.out.println("Return from multiplyWithRecursion2(): " + multiplyWithRecursion2(22, 5));

//        System.out.print("Enter a number between 1 and 10: ");
//        int userInput = getInteger(1, 10);
//        System.out.println("Validated input: " + userInput);

        calculateFactorial();

    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int dividend, int divisor) {
        return (double) dividend / divisor;
    }

    public static int modulus(int a, int b) {
        return a % b;
    }

    public static int multiplyWithoutMultiplying(int a, int b) {
        int product = 0;
        for (int i=0;i<b;i++) {
            product += a;
        }
        return product;
    }

    public static int multiplyWithRecursion(int a, int counter) {
//        int counter = 1;
        int returnInt = 0;
        System.out.println("We are on iteration: " + counter + "of multiplyWithRecursion()");
        while (counter > 1) {
            returnInt += a;
            multiplyWithRecursion(a, counter-1);
//            counter++;
        }
        return returnInt;
    }

    public static int multiplyWithRecursion2(int a, int counter) {
        if (counter <= 1) {
            return a;
        }
        return a + multiplyWithRecursion2(a, counter-1);
    }

    public static int getInteger(int min, int max) {
        Scanner getIntegerScanner = new Scanner(System.in);
        int userInput = Integer.parseInt(getIntegerScanner.next());
        if (userInput > min && userInput < max) {
            return userInput;
        } else {
            System.out.print("Please enter an integer between " + min + " and " + max + ": ");
            return getInteger(min, max);
        }
    }

    public static void calculateFactorial() {
        Scanner factorialScanner = new Scanner(System.in);
        System.out.print("Please enter an integer between 1 and 21: ");
        int userInput = getInteger(1, 21);
        long factorial = 1;
        for (int i=1;i<=userInput;i++) {
            factorial *= i;
        }
        System.out.println("The factorial of " + userInput + " is: " + factorial);
        System.out.print("Would you like to continue? (y/n): ");
        if(factorialScanner.nextLine().toLowerCase().equals("y")) {
            calculateFactorial();
        }
    }

}
