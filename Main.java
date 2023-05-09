import java.io.InputStream;
import java.util.*;
import javax.swing.JOptionPane;
import java.lang.*;
import java.io.InputStream;
class Main {
    static boolean ordering=true;
    public static void menu()
    {
        System.out.println("Welcome to our Toffee online store, please enter your choice: "
                +"\n1- Sign-up as a user"
                +"\n2- Log-in"
                +"\n3- Update info"
                +"\n4- View Category"
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
            menu();
            int choice= sc.nextInt();
            switch (choice)
            {
                case 1:


                    System.out.print("Enter your User name: ");
                    String name = sc.next() + sc.nextLine();
                    while (!system.validate_name(name)) {
                        name = sc.nextLine();
                    }
//                    System.out.println(system.Name());

                    System.out.println("Enter your Email: ");
                    String email = sc.next();
                    while (!system.validate_email(email)) {
                        email = sc.next();
                    }
//                    System.out.println(system.getEmail());

                    System.out.print("Enter your phone number: ");
                    String phone = sc.next();
                    while (!system.validate_phone(phone)) {
                        email = sc.next();
                    }
//                    System.out.println(system.getPhone());

                    System.out.print("Enter your address: ");
                    String address = sc.next();


                    System.out.print("Enter your password: ");
                    String password = sc.next();
                    while (!system.validate_pass(password)) {
                        password = sc.next();
                    }
//                    System.out.println(system.getPassword());


                    system.SignUp(system.Name(), system.getEmail(), system.getPhone(), address, system.getPassword());
                    break;
                case 2:

                    System.out.print("Enter your email: ");
                    String Email = sc.next();

                    System.out.print("Enter your password: ");
                    String Pass = sc.next();
//                    SYSTEM s = new SYSTEM();
                    system.Login(Email, Pass);
                    break;
                case 3:
                    break;
                case 4:
                    Category c= new Category();
                    c.display_category();
                    break;
                case 5:
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
