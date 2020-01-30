import java.util.Scanner;
import java.lang.Math;

public class HighLow {
    public static void main(String[] args) {
        playGame();
    }

    public static void playGame() {
        Scanner scanner = new Scanner(System.in);
        int randomNumber = returnRandom();
        int numberOfGuesses = 6;
        boolean winOrLose = false;
        while (!winOrLose) {
            winOrLose = makeGuess(randomNumber, numberOfGuesses);
            numberOfGuesses--;
        }
        System.out.print("Would you like to play again? (y/n): ");
        String response = scanner.nextLine();
        if(response.toLowerCase().equals("y")) {
            playGame();
        }
    }

    public static int returnRandom() {
        return (int) Math.ceil(Math.random() * 100);
    }

    public static boolean makeGuess(int inputRandomNumber, int inputNumberOFGuesses) {
        if (inputNumberOFGuesses == 0) {
            System.out.println("GAME OVER: Too many guesses.");
            return true;
        }
        int userGuess = getInteger(1, 100);
        if (userGuess < inputRandomNumber) {
            System.out.println("HIGHER! Number of guesses left: " + inputNumberOFGuesses);
            return false;
        } else if (userGuess > inputRandomNumber) {
            System.out.println("LOWER! Number of guesses left: " + inputNumberOFGuesses);
            return false;
        } else {
            System.out.println("GOOD GUESS!");
            return true;
        }
    }

    public static int getInteger(int min, int max) {
        System.out.print("Please enter an integer between " + min + " and " + max + ": ");
        Scanner getIntegerScanner = new Scanner(System.in);
        int userInput = Integer.parseInt(getIntegerScanner.next());
        if (userInput > min && userInput < max) {
            return userInput;
        } else {
            return getInteger(min, max);
        }
    }
}
