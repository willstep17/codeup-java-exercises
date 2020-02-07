package exceptions;

import java.util.Scanner;

public class ExceptionsLecture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int[] testArray = {2, 5, 6, 2, 6, 2,};
//        String testString = null;
//
//        try {
//            System.out.println(testString);
////            System.out.println(divide(3, 0));
////            System.out.println(returnAtArrayIndex(7, testArray));
//        } catch (ArithmeticException e) {
//            System.out.println("An arithmetic exception occurred");
//            e.printStackTrace();
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("An out of bounds exception occurred");
//            e.printStackTrace();
//        } catch (Exception e) {
//            System.out.println("A generic exception occurred");
//            e.printStackTrace();
//        }

        try {
            System.out.println(divide(3, 5));
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }

//        boolean moveOn = false;
//        int i = 0;
//        do {
//            try {
//                System.out.print("Enter an integer: ");
//                i = scanner.nextInt();
//                moveOn = true;
//            } catch (Exception e) {
//                e.printStackTrace();
//                System.out.println("Please enter an INTEGER.");
//            }
//        } while (moveOn);

    }

    static int divide(int a, int b) throws ArithmeticException {
        if(b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }

    static int returnAtArrayIndex(int i, int[] inputArray) {
        return inputArray[i];
    }

//    static boolean isAnInt(int a) {
//
//    }



}
