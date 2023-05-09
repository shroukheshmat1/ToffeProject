import java.io.InputStream;
import java.util.*;
import javax.swing.JOptionPane;
import java.lang.*;
import java.io.InputStream;
class Main {
    static boolean ordering=true;
    public static void Mainmenu()
    {
        System.out.println("Welcome to our Toffee online store, please enter your choice: "
                +"\n1- Sign-up as a user"
                +"\n2- Log-in"
                +"\n3- View Category"
                +"\n4- Search for a product"
                +"\n5- Reset Password"
                +"\n4- Exit");
    }
    public static void AfterLogInmenu()
    {
        System.out.println("Welcome Back! please enter your choice: "
                +"\n1- Reset Password"
                +"\n2- View Category"
                +"\n3- Search for a product"
                +"\n5- Place an Order"
                +"\n6- Add items into your Cart"
                +"\n7- Delete Account"
                +"\n7- Exit");
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        SYSTEM system = new SYSTEM();
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

                    System.out.print("Enter your address: ");
                    String address = sc.next();


                    System.out.print("Enter your password: ");
                    String password = sc.next();
                    while (!system.validate_pass(password)) {
                        password = sc.next();
                    }


                    system.SignUp(system.Name(), system.getEmail(), system.getPhone(), address, system.getPassword());
                    break;
                case 2:

                    System.out.print("Enter your email: ");
                    String Email = sc.next();

                    System.out.print("Enter your password: ");
                    String Pass = sc.next();
                    system.Login(Email, Pass);
                    break;
                case 3:
                    Category c= new Category();
                    c.display_category();
                    break;
                case 4:
                    System.out.println("Enter your the product you're searching about: ");
                    String product = sc.next();
                    Category C=new Category();
                    C.Search_for_a_product(product);
                    break;
                case 5:
                    System.out.print("Enter your email: ");
                    String EMail = sc.next();

                    System.out.print("Enter your password: ");
                    String oldPass = sc.next();
                    system.resetpass(EMail,oldPass);
                    break;
                case 6:
                    break;
                case 7:
                    return;
                default:
                    System.out.println("Please enter a valid choice: ");
                    break;
            }
        }while (ordering);
    }
}
