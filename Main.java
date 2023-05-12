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
                7- Delete Account
                8- Exit""");
    }

    public static void AfterLogInmenu()
    {
        System.out.println("Welcome Back! please enter your choice: "
                +"\n1- Reset Password"
                +"\n2- View Category"
                +"\n3- Search for a product"
                +"\n4- Place an Order"
                +"\n5- Add items into your Cart"
                +"\n6- Delete Account"
                +"\n7- Exit");
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        SYSTEM system = new SYSTEM();
        boolean loggedIn = false;
        do
        {
            Mainmenu();
            int firstchoice= sc.nextInt();
            switch (firstchoice)
            {
                case 1:
                    System.out.print("Enter your User name: ");
                    String name = sc.next() + sc.nextLine();
                    while (!system.validate_name(name)) {
                        name = sc.nextLine();
                    }

                    System.out.println("Enter your Email: ");
                    String email = sc.next();
                    while (!system.validate_email(email)) {
                        email = sc.next();
                    }

                    System.out.print("Enter your phone number: ");
                    String phone = sc.next();
                    while (!system.validate_phone(phone)) {
                        phone = sc.next();
                    }
                    System.out.print("Enter your password: ");
                    String password = sc.next();
                    while (!system.validate_pass(password)) {
                        password = sc.next();
                    }
                    System.out.print("Enter your address: ");
                    String address = sc.next();

                    system.SignUp(system.Name(), system.getEmail(), system.getPhone(), address, system.getPassword());
                    break;
                case 2:

                    System.out.print("Enter your email: ");
                    String Email = sc.next();

                    System.out.print("Enter your password: ");
                    String Pass = sc.next();
                    system.Login(Email, Pass);
                    loggedIn = true;

                    // After logging in Successfully

                    AfterLogInmenu();
                    int choice= sc.nextInt();
                    Cart cart = new Cart();
                    switch (choice)
                    {
                        // reset password
                        case 1:
                            System.out.print("Enter your email: ");
                            String EMail = sc.next();

                            System.out.print("Enter your password: ");
                            String oldPass = sc.next();
                            system.resetpass(EMail, oldPass);
                            break;

                        //view category
                        case 2:
                            Category c= new Category();
                            c.displayCategory();
                            break;

                        // Search for a product
                        case 3:
                            break;

                        // place an order
                        case 4:
                            Order order = new Order(cart.getItems());
                            order.displayOrder();

                        // add items into cart
                        case 5:
                            Category category = new Category();
                            Cart cartt = new Cart();

                            System.out.println("Welcome to the Toffee Shop!");
                            category.displayCategory();

                            boolean done = false;
                            do
                            {
                                System.out.println("Enter a product name to add to your cart (or 'done' to finish):");
                                String productName = sc.nextLine().trim();
                                if (productName.equalsIgnoreCase("done")) {
                                    done = true;
                                }
                                else
                                {
                                    category.addProduct(productName, cartt);
                                }
                            }
                            while (!done);
                            System.out.println("Here is your cart:");
                            cartt.displayCart();
                            break;

                        // delete account
                        case 6:
                            break;

                        // exit
                        case 7:
                            break;
                    }

                    break;
                case 3:
                    Category c= new Category();
                    c.displayCategory();
                    break;
                case 4:
//                    System.out.println("Enter your the product you're searching about: ");
//                    String product = sc.next();
//                    Category C=new Category();
//                    C.Search_for_a_product(product);
//                    System.out.println("Contents of Hashtable:");
                    break;
                case 5:
                    if(loggedIn) {
                        System.out.print("Enter your email: ");
                        String EMail = sc.next();

                        System.out.print("Enter your password: ");
                        String oldPass = sc.next();
                        system.resetpass(EMail, oldPass);
                    }
                    else {
                        System.out.println("You have to log in first!");
                    }
                    break;
                case 6:
                    if(loggedIn) {
                        Category category = new Category();
                        Cart cartt = new Cart();

                        System.out.println("Welcome to the Toffee Shop!");
                        category.displayCategory();

                        boolean done = false;
                        while (!done) {
                            System.out.println("Enter a product name to add to your cart (or 'done' to finish):");
                            String productName = sc.nextLine().trim();
                            if (productName.equalsIgnoreCase("done")) {
                                done = true;
                            } else {
                                category.addProduct(productName, cartt);
                            }
                        }

                        System.out.println("Here is your cart:");
                        cartt.displayCart();
                    }
                    else{
                        System.out.println("You have to log in first!");
                    }
                    break;
                case 7:
                    break;
                case 8:
                    ordering=false;
                    break;
                default:
                    System.out.println("Please enter a valid choice: ");
                    break;
            }
        }while (ordering);
    }
}