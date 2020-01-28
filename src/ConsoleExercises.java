import java.util.Scanner;
import java.util.ArrayList;

public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately %.2f. \n", pi);
//
//        System.out.print("Please enter an integer: ");
//        int userInt = scanner.nextInt();
//
//        System.out.print("Please enter three words: ");
//        String firstWord = scanner.next();
//        String secondWord = scanner.next();
//        String thirdWord = scanner.next();
//        System.out.println(firstWord);
//        System.out.println(secondWord);
//        System.out.println(thirdWord);

//        System.out.print("Please enter a sentence: ");
//        String userSentence = scanner.nextLine();
//        System.out.println(userSentence);

        System.out.print("Enter length and width and height of Codeup classroom: ");
        String lengthAndWidth = scanner.nextLine();
        String[] lengthWidth = lengthAndWidth.split(" ");
        double length = Integer.parseInt(lengthWidth[0]);
        double width = Integer.parseInt(lengthWidth[1]);
        double height = Integer.parseInt(lengthWidth[2]);
        double perimeter = (length * 2) + (width * 2);
        System.out.printf("The perimeter of the classroom is: %i \n", perimeter);






    }
}
