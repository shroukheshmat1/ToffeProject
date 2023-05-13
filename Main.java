import java.util.*;
import java.lang.*;

class Main {
    static boolean ordering=true;
    public static void Mainmenu()
    {
        System.out.println("""
                Welcome to our Toffee online store, please enter your choice:\s
                1- Sign-up as a user
                2- Log-in
                3- View Category
                4- Search for a product
                5- Reset Password
                6- Add items into your Cart
                7- place an order
                8- Exit""");
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        SYSTEM system = new SYSTEM();
        Cart cart = new Cart();
        Category category = new Category();
        verifyOTP sentOTP = new verifyOTP();
        Random random = new Random();
        boolean loggedIn = false;

        do
        {
            Mainmenu();
            int Choice= sc.nextInt();
            switch (Choice)
            {
                case 1:
                    System.out.print("Enter your User name: ");
                    String name = sc.next() + sc.nextLine();
                    while (!system.validate_name(name)) {
                        name = sc.nextLine();
                    }

                    System.out.print("Enter your phone number: ");
                    String phone = sc.next();
                    while (!system.validate_phone(phone))
                    {
                        phone = sc.next();
                    }

                    System.out.print("Enter your address: ");
                    String address = sc.next() + sc.nextLine();
                    system.setAddress(address);


                    System.out.print("Enter your password: ");
                    String password = sc.next();
                    while (!system.validate_pass(password))
                    {
                        password = sc.next();
                    }

                    //___________________email_______________________
                    boolean valid = false;
                    while (!valid)
                    {
                        System.out.println("Enter your Email: ");
                        String email = sc.next();

                        // Validate the syntax
                        if(system.validate_email(email))
                        {
                            // Check if email is already existed
                            for (User user : User.users)
                            {
                                if (user.getEmail().equals(email))
                                {
                                    System.out.println("This email is already used, please enter another one");
                                    valid = false;
                                    break;
                                }
                            }

                            // if both are correct, send an OTP
                            if(!valid)
                            {
                                int OTP = random.nextInt(900000) + 100000;
                                String strOTP = Integer.toString(OTP);
                                sentOTP.sendOTPEmail(system.getEmail(), strOTP);
                                System.out.println("Enter the OTP sent to your email: ");
                                String inputOTP = sc.next();

                                if(inputOTP.equals(strOTP)) {
                                    System.out.println("Your account has been created successfully!");
                                    valid = true;
                                }
                                else {
                                    System.out.println("Invalid OTP. Please try again");
                                    valid = true;
                                }
                            }
                        }
                        else
                        {
                            System.out.println("Invalid email syntax. Please enter a valid email");
                        }
                    }

                    system.SignUp(system.Name(), system.getEmail(), system.getPhone(), system.getAddress(), system.getPassword());
                    break;
                case 2:

                    System.out.print("Enter your email: ");
                    String Email = sc.next();

                    System.out.print("Enter your password: ");
                    String Pass = sc.next();
                    system.Login(Email, Pass);
                    loggedIn = true;
                    break;
                case 3:
                    category.displayCategory();
                    break;
                case 4:
                    System.out.println("Enter your the product you're searching about: ");
                    String product = sc.next();
                    category.SearchForaProduct(product);
                    break;
                case 5:
                    if(loggedIn) {
                        System.out.print("Enter your email: ");
                        String EMail = sc.next();
//                        System.out.print("Enter your old password: ");
//                        String oldPass = sc.next();
                        system.resetpass(EMail);
                    }
                    else {
                        System.out.println("You have to log in first!");
                    }
                    break;
                case 6:
                    if(loggedIn)
                    {
                        Scanner scan = new Scanner(System.in);
                        System.out.println("Welcome to the Toffee Shop!");
                        category.displayCategory();

                        boolean done = false;
                        while (!done)
                        {
                            System.out.println("Enter a product name to add to your cart (or 'done' to finish):");
                            String productName = scan.nextLine().trim();
                            if (productName.equalsIgnoreCase("done"))
                            {
                                done = true;
                            }
                            else
                            {
                                category.addProduct(productName, cart);
                            }
                        }
                        System.out.println("Here is your cart:");
                        cart.displayCart();
                    }
                    else
                    {
                        System.out.println("You have to log in first!");
                    }
                    break;
                case 7:
                    Order order = new Order(cart.getItems());
                    CheckOut checkOut = new CheckOut(order);

                    System.out.println("Choose a payment method:");
                    System.out.println("1. Pay with voucher");
                    System.out.println("2. Pay with smart wallet");
                    System.out.println("3. Pay with loyalty points");
                    System.out.println("4. Pay with cash on delivery");

                    int choice = sc.nextInt();
                    switch (choice) {
                        case 1:
                            order.displayOrder();
                            order.deliveryAddressCheck(system);
                            checkOut.payWithVoucher();
                            break;
                        case 2:
                            order.displayOrder();
                            order.deliveryAddressCheck(system);
                            checkOut.payWithSmartWallet();
                            break;
                        case 3:
                            order.displayOrder();
                            order.deliveryAddressCheck(system);
                            checkOut.payWithLoyaltyPoints();
                            break;
                        case 4:
                            order.displayOrder();
                            order.deliveryAddressCheck(system);
                            checkOut.payWithCashOnDelivery();
                            break;
                        default:
                            System.out.println("Invalid choice!");
                    }

                    break;
                case 8:
                    ordering=false;
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }while(ordering);
    }
}
