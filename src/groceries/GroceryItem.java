package groceries;

public class GroceryItem {
    private String name;
    private int category;
    private int quantity;

    public GroceryItem(String inputName, int inputCategory, int inputQuantity) {
        this.name = inputName;
        this.category = inputCategory;
        this.quantity = inputQuantity;
    }

    public String getName() {
        return this.name;
    }

    public int getCategory() {
        return this.category;
    }

    public int getQuantity() {
        return this.quantity;
    }

}
