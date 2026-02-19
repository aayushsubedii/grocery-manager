public class GroceryManager {

    public static void printInventory(String[] names, double[] prices, int[] stocks) {
        for (int i = 0; i < names.length; i++) {
            if (names[i] != null) {
                System.out.println(names[i] + " - $" + prices[i] + " - Stock: " + stocks[i]);
            } else {
            }
        }
    }

    public static void restockItem(String[] names, int[] stocks, String target, int amount) {
        boolean found = false;
        
        for (int i = 0; i < names.length; i++) {
            if (names[i] != null && names[i].equals(target)) {
                stocks[i] += amount;
                System.out.println("Restocked " + target + ". New stock: " + stocks[i]);
                found = true;
                break;
            }
        }
        
        if (!found) {
            System.out.println("Item not found.");
        }
    }

    public static void main(String[] args) {
        String[] itemNames = new String[10];
        double[] itemPrices = new double[10];
        int[] itemStocks = new int[10];

        itemNames[0] = "Milk";
        itemPrices[0] = 3.49;
        itemStocks[0] = 10;

        printInventory(itemNames, itemPrices, itemStocks);
        
        // You can add test code for your method here temporarily
        restockItem(itemNames, itemStocks, "Milk", 5);
        restockItem(itemNames, itemStocks, "Butter", 3);
        printInventory(itemNames, itemPrices, itemStocks);
    }
}
