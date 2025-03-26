import java.util.HashMap;
import java.util.Scanner;

class ProductNotFoundException extends Exception {
    public ProductNotFoundException(String productId) {
        super("Product with ID " + productId + " not found.");
    }
}

class assignment12 {
    public static void main(String[] args) {
        HashMap<String, String> inventory = new HashMap<>();
        inventory.put("P101", "Laptop");
        inventory.put("P102", "Mobile");
        inventory.put("P103", "Tablet");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter product ID to search: ");
        String productId = sc.nextLine();

        try {
            if (!inventory.containsKey(productId)) {
                throw new ProductNotFoundException(productId);
            }
            System.out.println("Product found: " + inventory.get(productId));
        } catch (ProductNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
