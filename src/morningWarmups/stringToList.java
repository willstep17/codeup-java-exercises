package morningWarmups;

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class stringToList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("Enter a String: ");
            String userInput = scanner.nextLine();
            String[] wordsArray = userInput.split(" ");
            ArrayList<String> strings = new ArrayList<>(Arrays.asList(wordsArray));
            for(String word : strings) {
                System.out.println(word);
            }
            System.out.print("Would you like to enter another word? (y/n): ");
            String response = scanner.nextLine();
            if(response.toLowerCase().equals("n")) {
                return;
            }
        }

    }
}
