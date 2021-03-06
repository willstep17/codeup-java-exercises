import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {

//        System.out.println(add(2, 4));
//        System.out.println(subtract(3, 1));
//        System.out.println(multiply(4, 5));
//        System.out.println(divide(15, 5));
//        System.out.println(divide(4, 0)); //Infinity
//        System.out.println(modulus(27, 6));

//        System.out.println(multiplyWithoutMultiplying(3,7));

//        System.out.println("Return from multiplyWithRecursion2(): " + multiplyWithRecursion2(22, 5));

//        System.out.print("Enter a number between 1 and 10: ");
//        int userInput = getInteger(1, 10);
//        System.out.println("Validated input: " + userInput);

        calculateFactorial();

    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double dividend, double divisor) {
        return dividend / divisor;
    }

    public static double modulus(double a, double b) {
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
        int returnInt = 0;
        System.out.println("We are on iteration: " + counter + "of multiplyWithRecursion()");
        while (counter > 1) {
            returnInt += a;
            multiplyWithRecursion(a, counter-1);
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
        int userInput = getIntegerScanner.nextInt();
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
        int base = getInteger(1, 21);
        long factorial = 1;
        String output = "! = 1";
        System.out.printf("1%s\n", output);
        for (int i=2;i<=base;i++) {
            factorial *= i;
            output += " x " + i;
            System.out.printf("%d%s = %d\n", i, output, factorial);
        }
        System.out.print("Would you like to continue? (y/n): ");
        if(factorialScanner.nextLine().toLowerCase().equals("y")) {
            calculateFactorial();
        }
    }

}
