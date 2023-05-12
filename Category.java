import java.util.ArrayList;
import java.util.Scanner;

public class Category {
    private ArrayList<Product> products = new ArrayList<Product>();
    private Scanner scanner = new Scanner(System.in);

    public Category() {
        // Add some sample products to the ArrayList
        products.add(new Product("Toffee Sauce", 40));
        products.add(new Product("Toffee cookies", 20));
        products.add(new Product("Toffee cakes", 25));
        products.add(new Product("Toffee-Coated Apple", 10));
        products.add(new Product("vanilla Toffee Popcorn", 15));
        products.add(new Product("Caramel Toffee Popcorn", 15));
        products.add(new Product("Toffee tea", 10));
        products.add(new Product("Toffee coffee", 15));
        products.add(new Product("Sugar-free Toffee", 25));
        products.add(new Product("Chocolate Toffee bar", 15));
        products.add(new Product("Caramel Toffee bar", 15));
        products.add(new Product("Butter Toffee bar", 20));
        products.add(new Product("Nugget with toffee pieces", 35));
        products.add(new Product("Galaxy Chocolate", 15));
        products.add(new Product("lotus Biscut", 15));
        products.add(new Product("Chips", 10));
        products.add(new Product("Lollipops", 5));
    }

    public void displayCategory() {
        for (Product product : products) {
            System.out.println("Product: " + product.getName() + ", Price: " + product.getPrice());
        }
    }

    public void addProduct(String productName, Cart cart) {
        // search for the product
        Product product = null;
        for (Product p : products) {
            if (p.getName().equalsIgnoreCase(productName)) {
                product = p;
                break;
            }
        }

        if (product == null) {
            System.out.println("Product not found. Available products:");
            displayCategory();
            return;
        }

        System.out.println("Enter quantity:");
        int quantity = scanner.nextInt();
        scanner.nextLine();

        if (quantity <= 0) {
            System.out.println("Invalid quantity.");
            return;
        }

        // finally add to cart
        cart.addToCart(product, quantity);

        System.out.println(quantity + " " + productName + " added to cart.");
    }

    public boolean SearchForaProduct (String SearchedProduct)
    {
        boolean found = false;
        for (Product product : products)
        {
            if ((SearchedProduct.toLowerCase()).equals(product.getName().toLowerCase()))
            {
                System.out.println("Product: \" " + product.getName() + " \" is available, Price: " + product.getPrice());
                found=true;
                return found;
            }
        }
        if (!found)
        {
            System.out.println("Product \" "  + SearchedProduct + " \" is not available");
            found=false;
            return found;
        }
        return found;
    }
}
