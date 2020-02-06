package groceries;

import java.util.HashMap;
import java.util.Scanner;

public class GroceriesApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, GroceryItem> items = new HashMap<>();

        String toContinue;
        Boolean startLoop = true;
        System.out.print("Welcome! Would you like to create a grocery list? (y/n): ");
        toContinue = scanner.nextLine();
        if(toContinue.toLowerCase().equals("n")) {
            System.out.println("Goodbye");
            startLoop = false;
        }

        while(startLoop) {
            int category;
            String itemName;
            int quantity;
            String toContinueTwo;
            System.out.println("Add an item to list. Categories: ");
            System.out.println("1 - Bread and Bakery \n2 - Beverages \n3 - Dairy \n4 - Meat and Seafood \n5 - Miscellaneous");
            category = scanner.nextInt();
            System.out.print("Item Name: ");
            itemName = scanner.nextLine();
            System.out.println("Quantity: ");
            quantity = scanner.nextInt();
            GroceryItem newItem = new GroceryItem(itemName, category, quantity);
            items.put(itemName, newItem);
            System.out.println("Would you like to add another item? (y/n):");
            toContinueTwo = scanner.nextLine();
            if(toContinueTwo.toLowerCase().equals("n")) {
                return;
            }
        }
    }
}
