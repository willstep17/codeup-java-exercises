import java.util.Scanner;

public class consoleLecture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\n\nEnter something: ");
        String userInput = scanner.next();
        System.out.println("You entered: --> \"" + userInput + "\" <--");

    }
}
