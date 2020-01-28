import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;

public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately %.2f. \n", pi);

        System.out.print("Please enter an integer: ");
        int i = 0;
        while(i != -1) {
            System.out.println("Please enter an integer: ");
            try {
                int userInt = scanner.nextInt();
                System.out.printf("\nThe integer is: %d \n", userInt);
            } catch(InputMismatchException ime) {
                System.out.println("\nThat is not an integer. \n");
                i = 0;
            }
        }




//        System.out.print("Please enter three words: ");
//        String firstWord = scanner.next();
//        String secondWord = scanner.next();
//        String thirdWord = scanner.next();
//        System.out.printf("\n The words are \"%s\" \"%s\" \"%s\".",firstWord, secondWord, thirdWord);

//        System.out.print("Please enter a sentence: ");
//        String userSentence = scanner.nextLine();
//        System.out.printf("\nThe sentence is: %s", userSentence);

        System.out.print("Enter length and width and height of Codeup classroom: ");
        String lengthAndWidth = scanner.nextLine();
        String[] lengthWidthArea = lengthAndWidth.split(" ");
        double length = Float.parseFloat(lengthWidthArea[0]);
        double width = Float.parseFloat(lengthWidthArea[1]);
        double height = Float.parseFloat(lengthWidthArea[2]);
        System.out.printf("The perimeter of the classroom is: %.2f. \n The area of the classroom is: %.2f. \n" +
                " The volume of the classroom is %.2f.", 2*(length+width), length*width, length*width*height);

    }
}
