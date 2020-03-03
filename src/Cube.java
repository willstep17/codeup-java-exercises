import java.util.Scanner;

public class Cube {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a number to cube (-1 to exit): ");
            int userInput = Integer.parseInt(scanner.next());
            if (userInput == -1) {
                break;;
            }
            System.out.println(userInput + " cubed is: " + cube(userInput));
        }
    }

    public static long cube(int inputNum) {
        long cubed = inputNum * inputNum * inputNum;
        return cubed;
    }
}
