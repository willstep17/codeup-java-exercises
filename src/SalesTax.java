import java.util.ArrayList;

public class SalesTax {
    public static void main(String[] args) {
        String[] items = {"1 Chinese Dragon at $45.63", "4 Lopsided Table at $11.99", "2 Hot Water Heater at $500.00"};
        returnSalesTax(items);
    }

    private static void returnSalesTax(String[] items) {
        ArrayList<Integer> quantities = new ArrayList<>();
        ArrayList<String> itemNames = new ArrayList<>();
        ArrayList<Double> prices = new ArrayList<>();
        for(String item : items) {
            int priceAt = 0;
            String[] itemSplit = item.split(" ");
            quantities.add(Integer.parseInt(itemSplit[0]));
            String workingItemName = itemSplit[1];
            for(int i=2;i<itemSplit.length;i++) {
                if(itemSplit[i].equals("at")) {
                    itemNames.add(workingItemName);
                    priceAt = i + 1;
                    break;
                } else {
                    workingItemName += " " + itemSplit[i];
                }
            }
            System.out.println(Double.parseDouble(itemSplit[priceAt].substring(1)));
            prices.add(Double.parseDouble(itemSplit[priceAt].substring(1)));
        }
        double totalPrice = calculateTotalPrice(quantities, prices);
        double salesTax = totalPrice *
    }

    private static double calculateTotalPrice(ArrayList<Integer> inputQuantities, ArrayList<Double> inputPrices) {
        double totalPrice = 0;
        for(int i=0;i<inputQuantities.size();i++) {
            totalPrice += inputQuantities.get(i) * inputPrices.get(i);
        }
        return totalPrice
    }


    String phrase = "the music made   it   hard      to        concentrate";
    String delims = "[ ]+";
    String[] tokens = phrase.split(delims);
}

    String delims = "[,]";
    String[] tokens = employee.split(delims);
