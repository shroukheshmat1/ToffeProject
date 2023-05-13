import java.util.ArrayList;
import java.util.Scanner;

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

    }



    public void askForDeliveryAddress(SYSTEM system) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to deliver to your address (" + system.getAddress() + ")? (yes/no)");
        String choice = scanner.nextLine();
        if (choice.equalsIgnoreCase("no")) {
            System.out.println("Please enter your new delivery address:");
            String newAddress = scanner.nextLine();
            system.setAddress(newAddress);
            System.out.println("Delivery address updated to: " + system.getAddress());
        }
        else if(choice.equalsIgnoreCase("yes")) {
            System.out.println("Delivery will be made to your address: " + system.getAddress());
        }
    }


    public ArrayList<CartItem> getItems()
    {
        return items;
    }
}
