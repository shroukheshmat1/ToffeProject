import java.util.ArrayList;

public class Cart {
    private ArrayList<CartItem> items = new ArrayList<>();

    public void addToCart(Product product, int quantity) {
        CartItem item = null;

        // Check if the product is already in the cart
        for (CartItem i : items) {
            if (i.getProduct().getName().equals(product.getName())) {
                item = i;
                break;
            }
        }

        if (item == null) {
            // The product is not in the cart, create a new cart item
            item = new CartItem(product, quantity);
            items.add(item);
        }
        else {
            // The product is already in the cart, increase the quantity
            item.setQuantity(item.getQuantity() + quantity);
        }
    }

    public void displayCart() {
        System.out.println("Cart items:");
        for (CartItem item : items) {
            System.out.println("- " + item.getProduct().getName() + " (Quantity: " + item.getQuantity() + ")");
        }
    }

//    public void clearCart() {
//        items.clear();
//        System.out.println("Cart cleared.");
//    }

    public ArrayList<CartItem> getItems() {
        return items;
    }
}