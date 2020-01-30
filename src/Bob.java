import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = "";
        System.out.print("Have a conversation with Bob ('Bye' to leave): ");
        while (true) {
            userInput = scanner.nextLine();
            if (userInput.toLowerCase().equals("bye")) {
                break;
            }
            System.out.println(promptBob(userInput));
            System.out.print("Respond: ");
        }
    }

    public static String promptBob(String inputString) {
        if(inputString.endsWith("?")) {
            return "Sure.";
        } else if (inputString.endsWith("!")) {
            return "Whoa, chill out!";
        } else if (inputString.isEmpty()) {
            return "Fine. Be that way!";
        } else if (inputString.toLowerCase().equals("salas")) {
            return "*Bob cowers in fear*";
        } else {
            return "Whatever.";
        }
    }
}
