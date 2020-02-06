package groceries;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class GroceriesApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> categories = new ArrayList<>();
        categories.add("1 - Bread and Bakery");
        categories.add("2 - Beverages");
        categories.add("3 - Dairy");
        categories.add("4 - Meat and Seafood");
        categories.add("5 - Miscellaneous");

        HashMap<String, GroceryItem> item = new HashMap<>();

        while(true) {
            String toContinue;
            int category;
            String itemName;
            int quantity;
            System.out.print("Welcome! Would you like to create a grocery list? (y/n): ");
            toContinue = scanner.nextLine();
            if(toContinue.toLowerCase().equals("n")) {
                System.out.println("Goodbye");
                return;
            }
            System.out.println("Category: \n1 - Bread and Bakery \n2 - Beverages \n3 - Dairy \n4 - Meat and Seafood \n5 - Miscellaneous");
            category = scanner.nextInt();
            System.out.print("Item Name: ");
            itemName = scanner.nextLine();
            System.out.println("Quantity: ");
            quantity = scanner.nextInt();
            GroceryItem newItem = new GroceryItem(itemName, category, quantity);


        }
    }

}
