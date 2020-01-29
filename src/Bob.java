public class Bob {
    public static void main(String[] args) {
        System.out.println(promptBob("Hey Bob, how are you?"));
        System.out.println(promptBob("Answer me Bob!"));
        System.out.println(promptBob(""));
        System.out.println(promptBob("Hey Bob."));
        System.out.println(promptBob("Salas"));
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
