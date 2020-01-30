public class MethodsLecture {
    public static void main(String[] args) {
//        countTo(5);
//        sayHello("Hello", "Will");
//        countTo(3);
//        System.out.println(squareIt(3));
//        System.out.println(multiplyNumbers(1, 2, 3, 4));
//        System.out.println(multiplyNumbers(1, 2, 3));
        recursiveCountdown(10);
    }

    public static void countTo(int n) {
        for (int i=1;i<=n;i++) {
            System.out.println(i);
        }
    }

    public static void sayHello(String greeting, String name) {
        System.out.printf("%s, %s.\n", greeting, name);
        overloadExample();
        overloadExample("Dogfish");
        overloadExample("Car", "Pavement");
    }

    public static double squareIt(int inputNum) {
        return Math.pow(inputNum, 2);
    }

    public static double squareIt(long inputNum) {
        return Math.pow(inputNum, 2);
    }

    public static long multiplyNumbers(int one, int two, int three, int four) {
        return (long) one * two * three * four;
    }

    public static long multiplyNumbers(int one, int two, int three) {
        return (long) one * two * three;
    }

    public static long multiplyNumbers(int one, int two) {
        return (long) one * two;
    }

    public static void overloadExample() {
        System.out.println("Hello From anotherMethod");
    }

    public static void overloadExample(String inputString) {
        System.out.println("Here is a random word from the overloaded anotherMethod(String) anotherMethod: " + inputString);
    }

    public static void overloadExample(String inputString, String inputStringTwo) {
        System.out.println("Here are two words from the overloaded anotherMethod(String) anotherMethod: " + inputString
        + " " + inputStringTwo);
    }

    public static void recursiveCountdown(int n) {
        System.out.println("We are in recursiveCountdown() and n = " + n);
        if (n <= 0) {
            System.out.println("All done!");
            return;
        }
        recursiveCountdown(n-1);
    }
}
