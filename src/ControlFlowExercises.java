import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int i = 5;
//        while(i <= 15) {
//            System.out.print(i + " ");
//            i++;
//        }

//        for(int i=5;i<=15;i++) {
//            System.out.println(i + " ");
//        }

//        int r = 0;
//        do {
//            System.out.print(r);
//            r += 2;
//        } while (r <= 100);

//        for(int t=0;t<=100;t+=2) {
//            System.out.print(t + " ");
//        }

//        int j = 100;
//        do {
//            System.out.print(j + " ");
//            j -= 5;
//        } while (j >= -10);

//        for(int i=100;i>=-10;i-=5) {
//            System.out.print(i + " ");
//        }

//        long k = 2;
//        do {
//            System.out.println(k);
//            k *= k;
//        } while (k < 1000000);

//        for(long i=2;i<1000000;i*=i) {
//            System.out.println(i);
//        }

//        for(int i=1;i<=100;i++) {
//            if(i % 15 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else {
//                System.out.println(i);
//            }
//        }

//        fizzBuzz(100);

//        System.out.print("Enter an integer to go up to: ");
//        int userInput = Integer.parseInt(scanner.next());
//        System.out.println("Here is your table!\n");
//        System.out.println("Number | Squared | Cubed");
//        System.out.println("------ | ------- | -----");
//        for (int i=1;i<=userInput;i++) {
//            System.out.printf ("%-6d | %-7d | %d\n", i, i*i, i*i*i);
//        }

        getGrade();

    }

    private static void getGrade() {
        Scanner gradeScanner = new Scanner(System.in);
        int grade = -1;
        do {
            System.out.print("Enter a grade from 0 to 100 (-1 to exit): ");
            grade = Integer.parseInt(gradeScanner.next());
            if (grade == -1) {
                break;
            } else if (grade >= 88) {
                System.out.println("A");
            } else if (grade >= 80) {
                System.out.println("B");
            } else if (grade >= 67) {
                System.out.println("C");
            } else if (grade >= 60) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }
        } while (grade != -1);
    }

    private static boolean divisibleBy(int compare, int divisor) {
        return compare % divisor == 0;
    }

    private static void fizzBuzz(int inputNumber) {
        for(int i=1;i<inputNumber;i++) {
            if(divisibleBy(i, 15)) {
                System.out.println("FizzBuzz");
            } else if(divisibleBy(i, 5)) {
                System.out.println("Buzz");
            } else if(divisibleBy(i, 3)) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }
    }

}
