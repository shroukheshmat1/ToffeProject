//import java.io.InputStream;
//import java.util.*;
//import javax.swing.JOptionPane;
//import java.lang.*;
//import java.io.InputStream;
//class Main {
//    static boolean ordering=true;
//    public static void menu()
//    {
//        System.out.println("Welcome to our Toffe online store, please enter your choice: "
//        +"\n1- Sign-up as a user"
//        +"\n2- Log-in"
//        +"\n3- Update info"
//        +"\n4- View Category"
//        +"\n5- Place an Order"
//        +"\n6- Add items into your Cart"
//        +"\n7- Delete Account"
//        +"\n7- Exit");
//    }
//    public static void main(String[] args)
//    {
//        Scanner sc=new Scanner(System.in);
//        do
//        {
//            menu();
//            int choice= sc.nextInt();
//            switch (choice)
//            {
//                case 1:
//                    System.out.print("Enter your first name: ");
//                    String fname = sc.next();
//
//                    System.out.print("Enter your last name: ");
//                    String lname = sc.next();
//
////                    System.out.print("Enter your User name: ");
////                    String name=sc.nextLine();
////                    sc.nextLine();
//
//                    System.out.print("Enter your email: ");
//                    String email = sc.next();
//
//                    System.out.print("Enter your phone number: ");
//                    String phone = sc.next();
//
//                    System.out.print("Enter your address: ");
//                    String address = sc.next();
//
//
//                    System.out.print("Enter your password: ");
//                    String password = sc.next();
//
//                    User user = new User(fname, lname, email, phone, address, password);
//                    user.createaccount();
////                    user.ViewAllAccounts();
//                    break;
//                case 2:
//                    break;
//                case 3:
//                    break;
//                case 4:
//                    Category c= new Category();
//                    c.display_category();
//                    break;
//                case 5:
//                    break;
//                case 6:
//                    break;
//                case 7:
//                    break;
//                default:
//                    System.out.println("Please enter a valid choice: ");
//                    break;
//            }
//        }while (ordering);
//    }
//}








///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



//import java.io.InputStream;
//import java.util.*;
//import javax.swing.JOptionPane;
//import java.lang.*;
//import java.io.InputStream;
//class Main {
//    static boolean ordering=true;
//    public static void menu()
//    {
//        System.out.println("Welcome to our Toffe online store, please enter your choice: "
//                +"\n1- Sign-up as a user"
//                +"\n2- Log-in"
//                +"\n3- Update info"
//                +"\n4- View Category"
//                +"\n5- Place an Order"
//                +"\n6- Add items into your Cart"
//                +"\n7- Delete Account"
//                +"\n7- Exit");
//    }
//    public static void main(String[] args)
//    {
//        Scanner sc=new Scanner(System.in);
//        do
//        {
//            menu();
//            int choice= sc.nextInt();
//            switch (choice)
//            {
//                case 1:
//
//                    System.out.print("Enter your User name: ");
//                    String name = sc.next() + sc.nextLine();
//
//
//                    System.out.print("Enter your email: ");
//                    String email = sc.next();
//
//                    System.out.print("Enter your phone number: ");
//                    String phone = sc.next();
//
//                    System.out.print("Enter your address: ");
//                    String address = sc.next();
//
//
//                    System.out.print("Enter your password: ");
//                    String password = sc.next();
//
//                    SYSTEM ss = new SYSTEM();
//                    ss.SignUp(name, email, phone, address, password);
//                    break;
//                case 2:
//
//                    System.out.print("Enter your email: ");
//                    String Email = sc.next();
//
//                    System.out.print("Enter your password: ");
//                    String pass = sc.next();
//                    SYSTEM s = new SYSTEM();
//                    s.LogIn(Email, pass);
//                    break;
//                case 3:
//                    break;
//                case 4:
//                    Category c= new Category();
//                    c.display_category();
//                    break;
//                case 5:
//                    break;
//                case 6:
//                    break;
//                case 7:
//                    break;
//                default:
//                    System.out.println("Please enter a valid choice: ");
//                    break;
//            }
//        }while (ordering);
//    }
//











//import java.io.InputStream;
//import java.util.*;
//import javax.swing.JOptionPane;
//import java.lang.*;
//import java.io.InputStream;
//class Main {
//    static boolean ordering=true;
//    public static void Mainmenu()
//    {
//        System.out.println("Welcome to our Toffee online store, please enter your choice: "
//                +"\n1- Sign-up as a user"
//                +"\n2- Log-in"
//                +"\n3- View Category"
//                +"\n4- Search for a product"
//                +"\n5- Reset Password"
//                +"\n4- Exit");
//    }
//    public static void AfterLogInmenu()
//    {
//        System.out.println("Welcome Back! please enter your choice: "
//                +"\n1- Reset Password"
//                +"\n2- View Category"
//                +"\n3- Search for a product"
//                +"\n5- Place an Order"
//                +"\n6- Add items into your Cart"
//                +"\n7- Delete Account"
//                +"\n7- Exit");
//    }
//    public static void main(String[] args)
//    {
//        Scanner sc=new Scanner(System.in);
//        SYSTEM system = new SYSTEM();
//        do
//        {
//            Mainmenu();
//            int firstchoice= sc.nextInt();
//            switch (firstchoice)
//            {
//                case 1:
//
//
//                    System.out.print("Enter your User name: ");
//                    String name = sc.next() + sc.nextLine();
//                    while (!system.validate_name(name)) {
//                        name = sc.nextLine();
//                    }
//
//                    System.out.println("Enter your Email: ");
//                    String email = sc.next();
//                    while (!system.validate_email(email)) {
//                        email = sc.next();
//                    }
//
//                    System.out.print("Enter your phone number: ");
//                    String phone = sc.next();
//                    while (!system.validate_phone(phone)) {
//                        phone = sc.next();
//                    }
//
//                    System.out.print("Enter your address: ");
//                    String address = sc.next();
//
//
//                    System.out.print("Enter your password: ");
//                    String password = sc.next();
//                    while (!system.validate_pass(password)) {
//                        password = sc.next();
//                    }
//
//                    SendingOTP sentotp=new SendingOTP();
//                    Random r=new Random();
//                    int otpcode=r.nextInt(100,999);
//                    String strOTP=Integer.toString(otpcode);
//                    sentotp.sendOTPEmail(email,strOTP);
//                    System.out.print("Please Enter the OTP sent to your email: ");
//                    String inputOTP = sc.next();
//                    if (inputOTP.equals(strOTP))
//                        System.out.print("User was saved ");
//
//                    system.SignUp(system.Name(), system.getEmail(), system.getPhone(), address, system.getPassword());
//                    break;
//                case 2:
//
//                    System.out.print("Enter your email: ");
//                    String Email = sc.next();
//
//                    System.out.print("Enter your password: ");
//                    String Pass = sc.next();
//                    system.Login(Email, Pass);
//                    break;
//                case 3:
//                    Category c= new Category();
//                   // c.displayCategory();
//                    break;
//                case 4:
//                    System.out.println("Enter your the product you're searching about: ");
//                    String product = sc.next();
//                    Category C=new Category();
//                  //  C.SearchForaProduct(product);
//                    break;
//                case 5:
//                    System.out.print("Enter your email: ");
//                    String EMail = sc.next();
//
//                    System.out.print("Enter your password: ");
//                    String oldPass = sc.next();
//                    system.resetpass(EMail,oldPass);
//                    break;
//                case 6:
//                    break;
//                case 7:
//                    return;
//                default:
//                    System.out.println("Please enter a valid choice: ");
//                    break;
//            }
//        }while (ordering);
//    }
//}












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
                    String address = sc.next();


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
                                }
                            }
                        }
                        else
                        {
                            System.out.println("Invalid email syntax. Please enter a valid email");
                        }
                    }

                    system.SignUp(system.Name(), system.getEmail(), system.getPhone(), address, system.getPassword());
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
                    if(!loggedIn) {
                        System.out.println("Welcome to the Toffee Shop!");
                        category.displayCategory();

                        boolean done = false;
                        while (!done) {
                            System.out.println("Enter a product name to add to your cart (or 'done' to finish):");
                            String productName = sc.nextLine().trim();
                            if (productName.equalsIgnoreCase("done")) {
                                done = true;
                            } else {
                                category.addProduct(productName, cart);
                            }
                        }

                        System.out.println("Here is your cart:");
                        cart.displayCart();
                    }
                    else{
                        System.out.println("You have to log in first!");
                    }
                    break;
                case 7:
                    Order order = new Order(cart.getItems());
                    order.displayOrder();
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
