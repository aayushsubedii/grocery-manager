public static void restockItem(String[] names, int[] stocks, String target, int amount) {
    boolean found = false;
    
    // Loop through the array to find the target item
    for (int i = 0; i < names.length; i++) {
        // Check if the current slot is not null and matches the target (case-sensitive)
        if (names[i] != null && names[i].equals(target)) {
            stocks[i] += amount; // Add amount to existing stock
            System.out.println("Restocked " + target + ". New stock: " + stocks[i]);
            found = true;
            break; // Exit loop once item is found
        }
    }
    
    // If item wasn't found after checking the entire array
    if (!found) {
        System.out.println("Item not found.");
    }
}
