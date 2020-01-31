import java.util.Scanner;
import java.lang.Math;

public class RollDice {
    public static void main(String[] args) {
        rollDice();
    }

    public static int returnRandom(int sides) {
        return (int) Math.ceil(Math.random() * sides);
    }

    public static void rollDice() {
        Scanner diceScanner = new Scanner(System.in);
        System.out.print("Please enter two dice sides separated by a space: ");
        int diceOneSides = Integer.parseInt(diceScanner.next());
        int diceTwoSides = Integer.parseInt(diceScanner.next());
        System.out.println("Side One Roll: " + returnRandom(diceOneSides));
        System.out.println("Side Two Roll: " + returnRandom(diceTwoSides));
        System.out.print("Would you like to continue (y/n): ");
        String response = diceScanner.next();
        if (response.toLowerCase().equals("y")) {
            rollDice();
        }
    }

}
