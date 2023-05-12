import java.util.ArrayList;
public class Order {
    private ArrayList<CartItem> items;

    public Order(ArrayList<CartItem> items)
    {
        this.items = items;
    }

    public double calculateTotal() {
        double total = 0;
        for (CartItem item : items)
        {
            total += item.getProduct().getPrice() * item.getQuantity();
        }
        return total;
    }

    public void displayOrder() {
        System.out.println("Order items:");
        for (CartItem item : items)
        {
            System.out.println("- " + item.getProduct().getName() + " (Quantity: " + item.getQuantity() + ", Price: " + item.getProduct().getPrice() + ")");
        }
        System.out.println("Total: " + calculateTotal());
        System.out.println("Order payed with cash !");
        System.out.println("Total price after cash fees : " + (calculateTotal() + 20));
    }

    public ArrayList<CartItem> getItems()
    {
        return items;
    }
}
