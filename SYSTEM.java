import java.lang.*;
import java.util.regex.Pattern;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Enumeration;
import java.lang.String;
import java.util.Scanner;
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



class User
{
    private String name;
    private String email;
    private String phone;
    private String address;
    private String password;
    void SetPass(String pass)
    {
        password=pass;
    }

    public static ArrayList<User> users = new ArrayList<User>();
    Hashtable<String, String> Emails_Pass = new Hashtable<String, String>();
    SYSTEM sys=new SYSTEM();
    public User(String nme, String emil, String ph, String addr, String passw)
    {
        this.name = nme;
        this.email = emil;
        this.phone = ph;
        this.address = addr;
        this.password = passw;
    }
    public String getPassword()
    {
        return this.password;
    }
    public String getEmail()
    {
        return this.email;
    }
    public void createaccount(User user)
    {
        users.add(user);
        System.out.println("User added successfully!");
        System.out.println("Welcome to Our System!");
        ViewAllAccounts();

    }
    public void SavedData(User user)
    {
        Emails_Pass.put(this.getEmail(),this.getPassword());
    }
    public void PRINT()
    {
        Enumeration<String>key=Emails_Pass.keys();
        while (key.hasMoreElements())
        {
            String NEXT=key.nextElement();
            System.out.println("Email: "+ NEXT +" , Password: "+ Emails_Pass.get(NEXT));
        }
    }
    public void ViewAllAccounts()
    {
        for (int id=0;id<users.size();id++)
        {
            System.out.println("Name of User no "+(id+1)+" is: " + users.get(id).name);
            System.out.println("Email of User no "+(id+1)+" is: " + users.get(id).email );
            System.out.println("Phone number of User no "+(id+1)+" is: " + users.get(id).phone );
            System.out.println("Address of User no "+(id+1)+" is: " + users.get(id).address );
            System.out.println("Password of User no "+(id+1)+" is: " + users.get(id).password );
        }
    }

    public void UpdateUser()
    {
        System.out.println("Enter your ID: ");
        int id=new Scanner(System.in).nextInt();
        if (id<=users.size())
        {
            for (int i=0;id<users.size();i++)
            {
                if (i==id-1)
                {
                    System.out.println("please enter your choice: "
                            +"\n1- Update your Username"
                            +"\n2- Update your Password"
                            +"\n3- Update your Email"
                            +"\n4- Update your Address"
                            +"\n5- Update your Phone number"
                            +"\n6- Exit");

                }
            }
        }
        else
            System.out.println("Invalid User Id");
    }

}


class Category
{
    Hashtable<String, Integer> products = new Hashtable<String, Integer>();
    void display_category()
    {
        products.put("Toffee Sauce", 40);
        products.put("Toffee cookies", 20);
        products.put("Toffee cakes", 25);
        products.put("Toffee-Coated Apple", 10);
        products.put("vanilla Toffee Popcorn", 15);
        products.put("Caramel Toffee Popcorn", 15);
        products.put("Toffee tea", 10);
        products.put("Toffee coffee", 15);
        products.put("Sugar-free Toffee", 25);
        products.put("Chocolate Toffee bar", 15);
        products.put("Caramel Toffee bar", 15);
        products.put("Butter Toffee bar", 20);
        products.put("Nugget with toffee pieces", 35);
        products.put("Galaxy Chocolate", 15);
        products.put("lotus Biscut", 15);
        products.put("Chips", 10);
        products.put("Lollipops", 5);

        Enumeration<String>key=products.keys();
        while (key.hasMoreElements())
        {
            String NEXT=key.nextElement();
            System.out.println("Product: "+ NEXT +" , Price: "+ products.get(NEXT));
        }
    }
    void Search_for_a_product (String searched_product)
    {
        Enumeration<String>key=products.keys();
        boolean found = false;
        while (key.hasMoreElements())
        {
            String NEXT=key.nextElement();
            System.out.println(searched_product.toLowerCase());
            System.out.println(NEXT.toLowerCase());
            if (searched_product.toLowerCase().equals(NEXT.toLowerCase()))
            {
                System.out.println("Product: "+ NEXT +" is valid, its Price: "+ products.get(NEXT));
                found=true;
                break;
            }
        }
        if (!found)
        {
            System.out.println("Product \" "  + searched_product + " \" is not valid");
        }
    }
}
