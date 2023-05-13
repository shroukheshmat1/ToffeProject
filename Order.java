import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

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



    public void deliveryAddressCheck(SYSTEM system) {
        verifyOTP sentOTP = new verifyOTP();
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Do you want to deliver to your address (" + system.getAddress() + ")? (yes/no)");
        String choice = scanner.nextLine();
        if (choice.equalsIgnoreCase("no")) {
            // email verification
            System.out.println("An OTP has sent to your email please check it !");
            int OTP = random.nextInt(900000) + 100000;
            String strOTP = Integer.toString(OTP);
            sentOTP.sendOTPEmail(system.getEmail(), strOTP);
            System.out.println("Enter the OTP sent to your email: ");
            String inputOTP = scanner.next();

            if(inputOTP.equals(strOTP)) {
                System.out.println("Your account has been created successfully!");
            }
            else {
                System.out.println("Invalid OTP. Please try again");
            }
            // update address
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
