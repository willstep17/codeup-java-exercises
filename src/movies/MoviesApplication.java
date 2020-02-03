package movies;

import java.util.Scanner;

public class MoviesApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int userChoice = 6;
        do {
            System.out.println("What would you like to do?\n");
            System.out.println("0 - Exit");
            System.out.println("1 - View All Movies");
            System.out.println("2 - View Movies in the Animated Category");
            System.out.println("3 - View Movies in the Drama Category");
            System.out.println("4 - View Movies in the Horror Category");
            System.out.println("5 - View Movies in the SciFi Category");
            System.out.println("6 - Exit\n");
            System.out.print("Enter Your Choice: ");
            userChoice = scanner.nextInt();

        } while(userChoice != 6);
    }

}
