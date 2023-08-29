package ecommerceWebssite;

import java.util.*;
public class EcommerceApp {
	
	
	private static List<Product> products = new ArrayList<>();
    private static ShoppingCart cart = new ShoppingCart();

    public static void main(String[] args) {
        initializeProducts();

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            displayMenu();
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    displayProducts();
                    break;
                case 2:
                    addToCart(scanner);
                    break;
                case 3:
                    viewCart();
                    break;
                case 4:
                    checkout();
                    break;
                case 5:
                    System.out.println("Thank you for using our e-commerce app!");
                    break;
                default:
                    System.out.println("Invalid choice. Please select again.");
            }
        } while (choice != 5);
    }

    private static void initializeProducts() {
        products.add(new Product(1, "Product 1", 10.99));
        products.add(new Product(2, "Product 2", 19.99));
        products.add(new Product(3, "Product 3", 29.99));
    }

    private static void displayMenu() {
        System.out.println("E-Commerce Application Menu");
        System.out.println("1. View Products");
        System.out.println("2. Add Product to Cart");
        System.out.println("3. View Cart");
        System.out.println("4. Checkout");
        System.out.println("5. Exit");
        System.out.print("Please select an option: ");
    }

    private static void displayProducts() {
        System.out.println("Available Products:");
        for (Product product : products) {
            System.out.println(product.getId() + ". " + product.getName() + " - $" + product.getPrice());
        }
    }

    private static void addToCart(Scanner scanner) {
        displayProducts();
        System.out.print("Enter the ID of the product you want to add to cart: ");
        int productId = scanner.nextInt();

        for (Product product : products) {
            if (product.getId() == productId) {
                cart.addItem(product);
                System.out.println(product.getName() + " added to cart.");
                return;
            }
        }

        System.out.println("Product not found.");
    }

    private static void viewCart() {
        List<Product> cartItems = cart.getItems();

        if (cartItems.isEmpty()) {
            System.out.println("Your cart is empty.");
        } else {
            System.out.println("Items in Cart:");
            for (Product item : cartItems) {
                System.out.println(item.getName() + " - $" + item.getPrice());
            }
            System.out.println("Total: $" + cart.calculateTotal());
        }
    }

    private static void checkout() {
        double total = cart.calculateTotal();
        if (total > 0) {
            System.out.println("Total amount to be paid: $" + total);
            System.out.println("Thank you for shopping with us!");
            cart = new ShoppingCart();
        } else {
            System.out.println("Your cart is empty. Nothing to checkout.");
        }
    }







	
}
