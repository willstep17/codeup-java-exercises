import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = "";
        System.out.print("Have a conversation with Bob (-1 to end): ");
        do {
            userInput = scanner.nextLine();
            if (userInput.equals("-1")) {
                break;
            }
            System.out.println(promptBob(userInput));
            System.out.print("Respond: ");
        } while (!userInput.equals("-1"));
    }

    public static String promptBob(String inputString) {
        if(inputString.endsWith("?")) {
            return "Sure.";
        } else if (inputString.endsWith("!")) {
            return "Whoa, chill out!";
        } else if (inputString.isEmpty()) {
            return "Fine. Be that way!";
        } else if (inputString.equals("Salas")) {
            return "*Bob cowers in fear*";
        } else {
            return "Whatever.";
        }
    }
}
