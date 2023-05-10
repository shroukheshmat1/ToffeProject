import java.lang.*;
import java.util.regex.Pattern;
import java.util.Scanner;
import java.lang.String;
public class SYSTEM
{
    private String name;
    private String email;
    private String phone;
    private String address;
    private String password;
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public SYSTEM(){}
    public  boolean validate_name(String N)
    {
        boolean val3=true;
        while (val3)
        {
            boolean Name_validate= Pattern.matches("^([A-Za-z]+)\\s([A-Za-z]+)$",N);
            if (Name_validate)
            {
                name=N;
                val3=false;
            }
            else
            {
                System.out.println("Invalid Username, rules of a username Name MUST consists of two partitions (ie: first and second name) saparated by a SINGLE space and the first letter of every part MUST be capital");
                System.out.println("Enter again your Username:");
                N=new Scanner(System.in).nextLine();
            }
        }
        return true;
    }
    public boolean validate_email(String E)
    {
        boolean val2=true;
        while (val2)
        {
            boolean email_validate= Pattern.matches("[a-zA-Z0-9]+@[a-zA-Z]+[.][a-zA-Z]{2,}",E);
            if (email_validate)
            {    email=E;
                val2=false;
            }
            else
            {
                System.out.println("Invalid Email,please Enter again your email:");
                E=new Scanner(System.in).nextLine();
            }
        }
        return true;
    }
    public boolean validate_pass(String pass)
    {
        boolean val=true;
        while (val)
        {
            boolean pass_validate= Pattern.matches("(?=.*[a-zA-Z])(?=.*[0-9])(?=.*[!@#$%^&_*]).{8,}",pass);
            if (pass_validate)
            {
                password=pass;
                val=false;
            }
            else
            {
                System.out.println("Invalid Password, rules of a password:\n 1- At least 8 chars\n 2- has at least one symbol\n 3- has at least one number\n 4- has at least one uppercase letter\n 5- has at least one lowercase letter ");
                System.out.println("Enter again your password:");
                pass=new Scanner(System.in).nextLine();
            }
        }
        return true;
    }
    public boolean validate_phone(String ph)
    {
        boolean val5=true;
        while (val5)
        {
            boolean phone_validate= Pattern.matches("(010|012|011|015)\\d{8}",ph);
            if (phone_validate)
            {    phone=ph;
                val5=false;
            }
            else
            {
                System.out.println("Invalid phone number, rules of a phone number: it MUST starts with 010 or 012 or 011 or 015 then followed by 8 numbers only");
                System.out.println("Enter again your phone number:");
                ph=new Scanner(System.in).nextLine();
            }
        }
        return true;
    }
    public boolean SignUp(String name, String email, String phone, String address, String pass) {

        User myuser = new User(name, email, phone, address, pass);
        myuser.createaccount(myuser);
        myuser.SavedData(myuser);
        return true;
    }

    public void Login(String E, String pass)
    {                                            // another log in method that loops only on the users arraylist
        boolean found = false;                  // doesn't use search method (hash table) :)
        for (User u : User.users) {
            if (u.getEmail().equals(E) && u.getPassword().equals(pass)) {
                System.out.println("logged-in successfully!");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("User was not found,Please Choose to Sign-UP to join us or try to login again with a correct email and password");
        }
    }
    public void resetpass(String E, String pass)
    {
        Scanner sc=new Scanner(System.in);
        SYSTEM system = new SYSTEM();
        System.out.println("please enter your new pass");
        String newpassword = sc.next();
        while (!system.validate_pass(newpassword))
        {
            newpassword = sc.next();
        }
        for (User u : User.users)
        {
            if (u.getEmail().equals(E) && u.getPassword().equals(pass))
            {
                u.SetPass(newpassword);
                System.out.println("Password was reset successfully");
                break;
            }
        }
    }
    public String Name()
    {
        return this.name;
    }
    public String getEmail()
    {
        return this.email;
    }
    public String getPhone()
    {
        return this.phone;
    }
    public String getPassword()
    {
        return this.password;
    }
    public String getAddress()
    {
        return this.address;
    }
}


