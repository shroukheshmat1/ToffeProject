//import java.io.File;
//import java.io.FileNotFoundException;
//import java.lang.*;
//import java.util.regex.Pattern;
//import java.io.File;
//import java.io.FileWriter;
//import java.io.PrintWriter;
//import java.util.Scanner;
//import java.util.ArrayList;
//import java.util.Hashtable;
//import java.util.Enumeration;
//import java.util.Scanner;
//public class SYSTEM
//{
////     private String name;
//    private String fname;
//    private String lname;
//     private String email;
//     private String phone;
//     private String address;
//    private String password;
//    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//    public boolean SignUp (String pass,String E,String ph,String FN,String LN,String add)
//    {
//        address=add;
//        boolean val=true;
//        boolean val2=true;
//        boolean val3=true;
//        boolean val4=true;
//        boolean val5=true;
//
//
//        while (val)
//        {
//            boolean pass_validate= Pattern.matches("(?=.*[a-zA-Z])(?=.*[0-9])(?=.*[!@#$%^&_*]).{8,}",pass);
//            if (pass_validate)
//            {    password=pass;
//                 val=false;
//            }
//            else
//            {
//                System.out.println("Invalid Password, rules of a password:\n 1- At least 8 chars\n 2- has at least one symbol\n 3- has at least one number\n 4- has at least one uppercase letter\n 5- has at least one lowercase letter ");
//                System.out.println("Enter again your password:");
//                pass=new Scanner(System.in).nextLine();
//            }
//        }
//
//        while (val2)
//        {
//            boolean email_validate= Pattern.matches("[a-zA-Z0-9]+@[a-zA-Z]+[.][a-zA-Z]{2,}",E);
//            if (email_validate)
//            {    email=E;
//                 val2=false;
//            }
//            else
//            {
//                System.out.println("Invalid Email,please Enter again your email:");
//                E=new Scanner(System.in).nextLine();
//            }
//        }
//
//        while (val3)
//        {
//            boolean Name_validate= Pattern.matches("[A-Za-z]+",FN);
//            if (Name_validate)
//            {    fname=FN;
//                 val3=false;
//            }
//            else
//            {
//                System.out.println("Invalid Username, rules of a username Name MUST consists of two partitions (ie: first and second name) saparated by a SINGLE space and it can be ended by any amount of numbers");
//                System.out.println("Enter again your Username:");
//                FN=new Scanner(System.in).nextLine();
//            }
//        }
//
//        while (val4)
//        {
//            boolean Name_validate= Pattern.matches("[A-Za-z]+",LN);
//            if (Name_validate)
//            {    lname=LN;
//                val4=false;
//            }
//            else
//            {
//                System.out.println("Invalid Username, rules of a username Name MUST consists of two partitions (ie: first and second name) saparated by a SINGLE space and it can be ended by any amount of numbers");
//                System.out.println("Enter again your Username:");
//                LN=new Scanner(System.in).nextLine();
//            }
//        }
//
//        while (val5)
//        {
//            boolean phone_validate= Pattern.matches("(010|012|011|015)\\d{8}",ph);
//            if (phone_validate)
//            {    phone=ph;
//                 val5=false;
//            }
//            else
//            {
//                System.out.println("Invalid phone number, rules of a phone number: it MUST starts with 010 or 012 or 011 or 015 then followed by 8 numbers only");
//                System.out.println("Enter again your phone number:");
//                ph=new Scanner(System.in).nextLine();
//            }
//        }
//        return true;
//    }
//    public String getFName()
//    {
//        return this.fname;
//    }
//    public String getLName()
//    {
//        return this.lname;
//    }
//    public String getEmail()
//    {
//        return this.email;
//    }
//    public String getPhone()
//    {
//        return this.phone;
//    }
//    public String getPassword()
//    {
//        return this.password;
//    }
//    public String getAddress()
//    {
//        return this.address;
//    }
//}
//
//
//
//class User
//{
////    private String name;
//    private String f_name;
//    private String l_name;
//    private String email;
//    private String phone;
//    private String address;
//    private String password;
//
//    public static ArrayList<User> users = new ArrayList<User>();
//
//    public User(String fnme,String lnme, String emil, String ph, String addr, String passw)
//    {
//        this.f_name = fnme;
//        this.l_name=lnme;
//        this.email = emil;
//        this.phone = ph;
//        this.address = addr;
//        this.password = passw;
//    }
//    public void createaccount()
//    {
//        SYSTEM sys = new SYSTEM();
//        String pass = this.password;
//        String Email = this.email;
//        String Phone = this.phone;
//        String FName = this.f_name;
//        String LName = this.l_name;
//        String Address = this.address;
//        if (sys.SignUp(pass, Email, Phone, FName, LName, Address))
//        {
//            User user = new User(f_name,l_name, email, phone, address, password);
//            users.add(user);
//            System.out.println("User added successfully!");
//            System.out.println("Welcome to Our System!");
//        }
//    }
//    public void ViewAllAccounts()
//    {
//        for (int id=0;id<users.size();id++)
//        {
//            System.out.println("Name of User no "+(id+1)+" is: " + users.get(id).f_name+" "+users.get(id).l_name);
//            System.out.println("Email of User no "+(id+1)+" is: " + users.get(id).email );
//            System.out.println("Phone number of User no "+(id+1)+" is: " + users.get(id).phone );
//            System.out.println("Address of User no "+(id+1)+" is: " + users.get(id).address );
//            System.out.println("Password of User no "+(id+1)+" is: " + users.get(id).password );
//        }
//    }
//
//    public void UpdateUser()
//    {
//        System.out.println("Enter your ID: ");
//        int id=new Scanner(System.in).nextInt();
//        if (id<=users.size())
//        {
//            for (int i=0;id<users.size();i++)
//            {
//                if (i==id-1)
//                {
//                    System.out.println("please enter your choice: "
//                            +"\n1- Update your Username"
//                            +"\n2- Update your Password"
//                            +"\n3- Update your Email"
//                            +"\n4- Update your Address"
//                            +"\n5- Update your Phone number"
//                            +"\n6- Exit");
//
//                }
//            }
//        }
//        else
//            System.out.println("Invalid User Id");
//    }
//
//}
//
//
//
//class Category
//{
//    Hashtable<String, Integer> products = new Hashtable<String, Integer>();
//
//    Category() throws FileNotFoundException {
//    }
//
//    void display_category()
//    {
//        products.put("Toffee Sauce", 40);
//        products.put("Toffee cookies", 20);
//        products.put("Toffee cakes", 25);
//        products.put("Toffee-Coated Apple", 10);
//        products.put("vanilla Toffee Popcorn", 15);
//        products.put("Caramel Toffee Popcorn", 15);
//        products.put("Toffee tea", 10);
//        products.put("Toffee coffee", 15);
//        products.put("Sugar-free Toffee", 25);
//        products.put("Chocolate Toffee bar", 15);
//        products.put("Caramel Toffee bar", 15);
//        products.put("Butter Toffee bar", 20);
//        products.put("Nugget with toffee pieces", 35);
//        products.put("Galaxy Chocolate", 15);
//        products.put("lotus Biscut", 15);
//        products.put("Chips", 10);
//        products.put("Lollipops", 5);
//
//        Enumeration<String>key=products.keys();
//        while (key.hasMoreElements())
//        {
//            String NEXT=key.nextElement();
//            System.out.println("Product: "+ NEXT +" , Price: "+ products.get(NEXT));
//        }
//    }
//    Scanner file_names= new Scanner(new File("Names.txt"));
//
//}




















////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//import java.lang.*;
//import java.util.regex.Pattern;
//import java.util.Scanner;
//import java.util.ArrayList;
//import java.util.Hashtable;
//import java.util.Enumeration;
//import java.util.Scanner;
//public class SYSTEM
//{
//    private String name;
//    private String email;
//    private String phone;
//    private String address;
//    private String password;
//    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//    public SYSTEM(){}
//    public boolean validate_name(String N)
//    {
//        boolean val3=true;
//        while (val3)
//        {
//            boolean Name_validate= Pattern.matches("^([A-Za-z]+)\\s([A-Za-z]+)$",N);
//            if (Name_validate)
//            {    name=N;
//                val3=false;
//            }
//            else
//            {
//                System.out.println("Invalid Username, rules of a username Name MUST consists of two partitions (ie: first and second name) saparated by a SINGLE space and the first letter of every part MUST be capital");
//                System.out.println("Enter again your Username:");
//                N=new Scanner(System.in).nextLine();
//            }
//        }
//        return true;
//    }
//    public boolean validate_email(String E)
//    {
//        boolean val2=true;
//        while (val2)
//        {
//            boolean email_validate= Pattern.matches("[a-zA-Z0-9]+@[a-zA-Z]+[.][a-zA-Z]{2,}",E);
//            if (email_validate)
//            {    email=E;
//                val2=false;
//            }
//            else
//            {
//                System.out.println("Invalid Email,please Enter again your email:");
//                E=new Scanner(System.in).nextLine();
//            }
//        }
//        return true;
//    }
//    public boolean validate_pass(String pass)
//    {
//        boolean val=true;
//        while (val)
//        {
//            boolean pass_validate= Pattern.matches("(?=.*[a-zA-Z])(?=.*[0-9])(?=.*[!@#$%^&_*]).{8,}",pass);
//            if (pass_validate)
//            {    password=pass;
//                val=false;
//            }
//            else
//            {
//                System.out.println("Invalid Password, rules of a password:\n 1- At least 8 chars\n 2- has at least one symbol\n 3- has at least one number\n 4- has at least one uppercase letter\n 5- has at least one lowercase letter ");
//                System.out.println("Enter again your password:");
//                pass=new Scanner(System.in).nextLine();
//            }
//        }
//        return true;
//    }
//    public boolean validate_phone(String ph)
//    {
//        boolean val5=true;
//        while (val5)
//        {
//            boolean phone_validate= Pattern.matches("(010|012|011|015)\\d{8}",ph);
//            if (phone_validate)
//            {    phone=ph;
//                val5=false;
//            }
//            else
//            {
//                System.out.println("Invalid phone number, rules of a phone number: it MUST starts with 010 or 012 or 011 or 015 then followed by 8 numbers only");
//                System.out.println("Enter again your phone number:");
//                ph=new Scanner(System.in).nextLine();
//            }
//        }
//        return true;
//    }
//    public boolean SignUp (String pass,String E,String ph,String N,String add)
//    {
//        address=add;
//        validate_name(N);
//        validate_email(E);
//        validate_phone(ph);
//        validate_pass(pass);
//        User myuser=new User (name,email,phone,address,password);
//        myuser.createaccount(myuser);
//        myuser.SavedData(myuser);
//        myuser.PRINT();
//        return true;
//    }
//
//    public void LogIn (String E, String pass)
//    {
//        User myuser=new User (name,email,phone,address,password);
//        if (myuser.Search(E,pass))
//        {
//            System.out.println("logged-in successfully!");
//        }
//        else
//        {
//            SYSTEM ss = new SYSTEM();
//            ss.SignUp(name, email, phone, address, password);
//        }
//    }
//    public String Name()
//    {
//        return this.name;
//    }
//    public String getEmail()
//    {
//        return this.email;
//    }
//    public String getPhone()
//    {
//        return this.phone;
//    }
//    public String getPassword()
//    {
//        return this.password;
//    }
//    public String getAddress()
//    {
//        return this.address;
//    }
//}
//
//
//
//class User
//{
//    private String name;
//    private String email;
//    private String phone;
//    private String address;
//    private String password;
//
//    public static ArrayList<User> users = new ArrayList<User>();
//    Hashtable<String, String> Emails_Pass = new Hashtable<String, String>();
//    SYSTEM sys=new SYSTEM();
//    public User(String nme, String emil, String ph, String addr, String passw)
//    {
//        this.name = nme;
//        this.email = emil;
//        this.phone = ph;
//        this.address = addr;
//        this.password = passw;
//    }
//    public String getPassword()
//    {
//        return this.password;
//    }
//    public String getEmail()
//    {
//        return this.email;
//    }
//    public void createaccount(User user)
//    {
//        users.add(user);
//        System.out.println("User added successfully!");
//        System.out.println("Welcome to Our System!");
//        ViewAllAccounts();
//
//    }
//    public void SavedData(User user)
//    {
//        Emails_Pass.put(this.getEmail(),this.getPassword());
//    }
//    public boolean Search (String em,String p)
//    {
//        boolean result = false;
//        Enumeration<String>key=Emails_Pass.keys();
//        while (key.hasMoreElements())
//        {
//            String NEXT=key.nextElement();
//            if ((NEXT==em)&&(Emails_Pass.get(NEXT)==p))
//            {
//                result=true;
//            }
//            else if ((NEXT==em)&&(Emails_Pass.get(NEXT)!=p))
//            {
//                System.out.println("Valid Email, Invalid pass,re-enter your password please");
//                p=new Scanner(System.in).nextLine();
//            }
//            else if ((NEXT!=em)&&(Emails_Pass.get(NEXT)==p))
//            {
//                System.out.println("Valid Password, Invalid Email,re-enter your Email please");
//                em=new Scanner(System.in).nextLine();
//            }
//            else
//            {
//                System.out.println("Neither email Nor password is on our system, please create a new account to join us using Sign-Up");
//                result=false;
//            }
//        }
//        return result;
//    }
//    public void PRINT()
//    {
//        Enumeration<String>key=Emails_Pass.keys();
//        while (key.hasMoreElements())
//        {
//            String NEXT=key.nextElement();
//            System.out.println("Email: "+ NEXT +" , Password: "+ Emails_Pass.get(NEXT));
//        }
//    }
//    public void ViewAllAccounts()
//    {
//        for (int id=0;id<users.size();id++)
//        {
//            System.out.println("Name of User no "+(id+1)+" is: " + users.get(id).name);
//            System.out.println("Email of User no "+(id+1)+" is: " + users.get(id).email );
//            System.out.println("Phone number of User no "+(id+1)+" is: " + users.get(id).phone );
//            System.out.println("Address of User no "+(id+1)+" is: " + users.get(id).address );
//            System.out.println("Password of User no "+(id+1)+" is: " + users.get(id).password );
//        }
//    }
//
//    public void UpdateUser()
//    {
//        System.out.println("Enter your ID: ");
//        int id=new Scanner(System.in).nextInt();
//        if (id<=users.size())
//        {
//            for (int i=0;id<users.size();i++)
//            {
//                if (i==id-1)
//                {
//                    System.out.println("please enter your choice: "
//                            +"\n1- Update your Username"
//                            +"\n2- Update your Password"
//                            +"\n3- Update your Email"
//                            +"\n4- Update your Address"
//                            +"\n5- Update your Phone number"
//                            +"\n6- Exit");
//
//                }
//            }
//        }
//        else
//            System.out.println("Invalid User Id");
//    }
//
//}
//
//
//class Category
//{
//    Hashtable<String, Integer> products = new Hashtable<String, Integer>();
//    void display_category()
//    {
//        products.put("Toffee Sauce", 40);
//        products.put("Toffee cookies", 20);
//        products.put("Toffee cakes", 25);
//        products.put("Toffee-Coated Apple", 10);
//        products.put("vanilla Toffee Popcorn", 15);
//        products.put("Caramel Toffee Popcorn", 15);
//        products.put("Toffee tea", 10);
//        products.put("Toffee coffee", 15);
//        products.put("Sugar-free Toffee", 25);
//        products.put("Chocolate Toffee bar", 15);
//        products.put("Caramel Toffee bar", 15);
//        products.put("Butter Toffee bar", 20);
//        products.put("Nugget with toffee pieces", 35);
//        products.put("Galaxy Chocolate", 15);
//        products.put("lotus Biscut", 15);
//        products.put("Chips", 10);
//        products.put("Lollipops", 5);
//
//        Enumeration<String>key=products.keys();
//        while (key.hasMoreElements())
//        {
//            String NEXT=key.nextElement();
//            System.out.println("Product: "+ NEXT +" , Price: "+ products.get(NEXT));
//        }
//    }
//}






//import java.lang.*;
//import java.util.regex.Pattern;
//import java.util.Scanner;
//import java.util.ArrayList;
//import java.util.Hashtable;
//import java.util.Enumeration;
//import java.lang.String;
//import java.util.Properties;
//import javax.mail.*;
//import javax.mail.internet.*;
//public class SYSTEM
//{
//    private String name;
//    private String email;
//    private String phone;
//    private String address;
//    private String password;
//    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//    public SYSTEM(){}
//    public  boolean validate_name(String N)
//    {
//        boolean val3=true;
//        while (val3)
//        {
//            boolean Name_validate= Pattern.matches("^([A-Za-z]+)\\s([A-Za-z]+)$",N);
//            if (Name_validate)
//            {
//                name=N;
//                val3=false;
//            }
//            else
//            {
//                System.out.println("Invalid Username, rules of a username Name MUST consists of two partitions (ie: first and second name) saparated by a SINGLE space and the first letter of every part MUST be capital");
//                System.out.println("Enter again your Username:");
//                N=new Scanner(System.in).nextLine();
//            }
//        }
//        return true;
//    }
//    public boolean validate_email(String E)
//    {
//        boolean val2=true;
//        while (val2)
//        {
//            boolean email_validate= Pattern.matches("^[a-zA-Z0-9._]+@[a-zA-Z0-9]+\\.[a-zA-Z]+$",E);
//            if (email_validate)
//            {    email=E;
//                val2=false;
//            }
//            else
//            {
//                System.out.println("Invalid Email,please Enter again your email:");
//                E=new Scanner(System.in).nextLine();
//            }
//        }
//        return true;
//    }
//    public boolean validate_pass(String pass)
//    {
//        boolean val=true;
//        while (val)
//        {
//            boolean pass_validate= Pattern.matches("(?=.*[a-zA-Z])(?=.*[0-9])(?=.*[!@#$%^&_*]).{8,}",pass);
//            if (pass_validate)
//            {
//                password=pass;
//                val=false;
//            }
//            else
//            {
//                System.out.println("Invalid Password, rules of a password:\n 1- At least 8 chars\n 2- has at least one symbol\n 3- has at least one number\n 4- has at least one uppercase letter\n 5- has at least one lowercase letter ");
//                System.out.println("Enter again your password:");
//                pass=new Scanner(System.in).nextLine();
//            }
//        }
//        return true;
//    }
//    public boolean validate_phone(String ph)
//    {
//        boolean val5=true;
//        while (val5)
//        {
//            boolean phone_validate= Pattern.matches("(010|012|011|015)\\d{8}",ph);
//            if (phone_validate)
//            {    phone=ph;
//                val5=false;
//            }
//            else
//            {
//                System.out.println("Invalid phone number, rules of a phone number: it MUST starts with 010 or 012 or 011 or 015 then followed by 8 numbers only");
//                System.out.println("Enter again your phone number:");
//                ph=new Scanner(System.in).nextLine();
//            }
//        }
//        return true;
//    }
//    public boolean SignUp(String name, String email, String phone, String address, String pass) {
//
//        User myuser = new User(name, email, phone, address, pass);
//        myuser.createaccount(myuser);
//        myuser.SavedData(myuser);
//        return true;
//    }
//
//    public void Login(String E, String pass)
//    {                                            // another log in method that loops only on the users arraylist
//        boolean found = false;                  // doesn't use search method (hash table) :)
//        for (User u : User.users) {
//            if (u.getEmail().equals(E) && u.getPassword().equals(pass)) {
//                System.out.println("logged-in successfully!");
//                found = true;
//                break;
//            }
//        }
//        if (!found) {
//            System.out.println("User was not found,Please Choose to Sign-UP to join us or try to login again with a correct email and password");
//        }
//    }
//    public void resetpass(String E, String pass)
//    {
//        Scanner sc=new Scanner(System.in);
//        SYSTEM system = new SYSTEM();
//        System.out.println("please enter your new pass");
//        String newpassword = sc.next();
//        while (!system.validate_pass(newpassword))
//        {
//            newpassword = sc.next();
//        }
//        for (User u : User.users)
//        {
//            if (u.getEmail().equals(E) && u.getPassword().equals(pass))
//            {
//                u.SetPass(newpassword);
//                System.out.println("Password was reset successfully");
//                break;
//            }
//        }
//    }
//    public String Name()
//    {
//        return this.name;
//    }
//    public String getEmail()
//    {
//        return this.email;
//    }
//    public String getPhone()
//    {
//        return this.phone;
//    }
//    public String getPassword()
//    {
//        return this.password;
//    }
//    public String getAddress()
//    {
//        return this.address;
//    }
//}
//
//
//
//class User
//{
//    private String name;
//    private String email;
//    private String phone;
//    private String address;
//    private String password;
//    void SetPass(String pass)
//    {
//        password=pass;
//    }
//
//    public static ArrayList<User> users = new ArrayList<User>();
//    Hashtable<String, String> Emails_Pass = new Hashtable<String, String>();
//    SYSTEM sys=new SYSTEM();
//    public User(String nme, String emil, String ph, String addr, String passw)
//    {
//        this.name = nme;
//        this.email = emil;
//        this.phone = ph;
//        this.address = addr;
//        this.password = passw;
//    }
//    public String getPassword()
//    {
//        return this.password;
//    }
//    public String getEmail()
//    {
//        return this.email;
//    }
//    public void createaccount(User user)
//    {
//        users.add(user);
//        System.out.println("User added successfully!");
//        System.out.println("Welcome to Our System!");
//        ViewAllAccounts();
//
//    }
//    public void SavedData(User user)
//    {
//        Emails_Pass.put(this.getEmail(),this.getPassword());
//    }
//    public void PRINT()
//    {
//        Enumeration<String>key=Emails_Pass.keys();
//        while (key.hasMoreElements())
//        {
//            String NEXT=key.nextElement();
//            System.out.println("Email: "+ NEXT +" , Password: "+ Emails_Pass.get(NEXT));
//        }
//    }
//    public void ViewAllAccounts()
//    {
//        for (int id=0;id<users.size();id++)
//        {
//            System.out.println("Name of User no "+(id+1)+" is: " + users.get(id).name);
//            System.out.println("Email of User no "+(id+1)+" is: " + users.get(id).email );
//            System.out.println("Phone number of User no "+(id+1)+" is: " + users.get(id).phone );
//            System.out.println("Address of User no "+(id+1)+" is: " + users.get(id).address );
//            System.out.println("Password of User no "+(id+1)+" is: " + users.get(id).password );
//        }
//    }
//
//    public void UpdateUser()
//    {
//        System.out.println("Enter your ID: ");
//        int id=new Scanner(System.in).nextInt();
//        if (id<=users.size())
//        {
//            for (int i=0;id<users.size();i++)
//            {
//                if (i==id-1)
//                {
//                    System.out.println("please enter your choice: "
//                            +"\n1- Update your Username"
//                            +"\n2- Update your Password"
//                            +"\n3- Update your Email"
//                            +"\n4- Update your Address"
//                            +"\n5- Update your Phone number"
//                            +"\n6- Exit");
//
//                }
//            }
//        }
//        else
//            System.out.println("Invalid User Id");
//    }
//
//}
//
//
//class Category
//{
//    Hashtable<String, Integer> products = new Hashtable<String, Integer>();
//    void display_category()
//    {
//        products.put("Toffee Sauce", 40);
//        products.put("Toffee cookies", 20);
//        products.put("Toffee cakes", 25);
//        products.put("Toffee-Coated Apple", 10);
//        products.put("vanilla Toffee Popcorn", 15);
//        products.put("Caramel Toffee Popcorn", 15);
//        products.put("Toffee tea", 10);
//        products.put("Toffee coffee", 15);
//        products.put("Sugar-free Toffee", 25);
//        products.put("Chocolate Toffee bar", 15);
//        products.put("Caramel Toffee bar", 15);
//        products.put("Butter Toffee bar", 20);
//        products.put("Nugget with toffee pieces", 35);
//        products.put("Galaxy Chocolate", 15);
//        products.put("lotus Biscut", 15);
//        products.put("Chips", 10);
//        products.put("Lollipops", 5);
//
//        Enumeration<String>key=products.keys();
//        while (key.hasMoreElements())
//        {
//            String NEXT=key.nextElement();
//            System.out.println("Product: "+ NEXT +" , Price: "+ products.get(NEXT));
//        }
//    }
//    void Search_for_a_product (String searched_product)
//    {
//        Enumeration<String>key=products.keys();
//        boolean found = false;
//        while (key.hasMoreElements())
//        {
//            String NEXT=key.nextElement();
//            System.out.println(searched_product.toLowerCase());
//            System.out.println(NEXT.toLowerCase());
//            if (searched_product.toLowerCase().equals(NEXT.toLowerCase()))
//            {
//                System.out.println("Product: "+ NEXT +" is valid, its Price: "+ products.get(NEXT));
//                found=true;
//                break;
//            }
//        }
//        if (!found)
//        {
//            System.out.println("Product \" "  + searched_product + " \" is not valid");
//        }
//    }
//}
//
//
//
//
//
//class SendingOTP {
//    public void sendOTPEmail(String toEmail, String otp) {
//        final String fromEmail = "toffeestore592@gmail.com"; // your Gmail account
//        final String appPassword = "zwahtynuhunuumfu"; // your Gmail app password
//
//        Properties property = new Properties();
//        property.put("mail.smtp.auth", "true");
//        property.put("mail.smtp.starttls.enable", "true");
//        property.put("mail.smtp.host", "smtp.gmail.com");
//        property.put("mail.smtp.port", "587");
//
//        Session session = Session.getInstance(property, new javax.mail.Authenticator()
//        {
//                    protected PasswordAuthentication getPasswordAuthentication()
//                    {
//                        return new PasswordAuthentication(fromEmail, appPassword);
//                    }
//        });
//
//        try
//        {
//            Message message = new MimeMessage(session);
//            message.setFrom(new InternetAddress(fromEmail));
//            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail));
//            message.setSubject("Your OTP Code");
//            message.setText("Your OTP Code is: " + otp);
//
//            Transport.send(message);
//
//            System.out.println("OTP email sent to " + toEmail);
//        } catch (MessagingException exception) {
//            System.out.println("Error sending OTP email: " + exception.getMessage());
//        }
//    }
//}
//










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
            boolean email_validate= Pattern.matches("^[a-zA-Z0-9._]+@[a-zA-Z0-9]+\\.[a-zA-Z]+$",E);
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


//    public void resetpass(String E) {
//        Scanner sc = new Scanner(System.in);
//        SYSTEM system = new SYSTEM();
//
//        System.out.println("Please enter your old password:");
//        String oldpassword = sc.next();
//
//        boolean oldCorrect = false;
//        for (User u : User.users) {
//            if (u.getEmail().equals(E) && u.getPassword().equals(oldpassword)) {
//                oldCorrect = true;
//                break;
//            }
//        }
//
//        if (!oldCorrect) {
//            System.out.println("Incorrect old password. Password reset failed.");
//            return;
//        }
//
//        System.out.println("Please enter your new password:");
//        String newpassword = sc.next();
//        while (!system.validate_pass(newpassword)) {
//            newpassword = sc.next();
//        }
//
//        for (User u : User.users) {
//            if (u.getEmail().equals(E)) {
//                u.SetPass(newpassword);
//                System.out.println("Password was reset successfully");
//                break;
//            }
//        }
//    }





    public void resetpass(String E) {
        Scanner sc = new Scanner(System.in);
        SYSTEM system = new SYSTEM();

        System.out.println("Please enter your old password:");
        String oldpassword = sc.next();

        boolean oldCorrect = false;
        for (User u : User.users) {
            if (u.getEmail().equals(E) && u.getPassword().equals(oldpassword)) {
                oldCorrect = true;
                break;
            }
        }

        if (!oldCorrect) {
            System.out.println("Incorrect old password. Password reset failed.");
            return;
        }

        System.out.println("Please enter your new password:");
        String newpassword = sc.next();
        while (!system.validate_pass(newpassword)) {
            newpassword = sc.next();
        }

        for (User u : User.users) {
            if (u.getEmail().equals(E)) {
                u.SetPass(system.getPassword());
                System.out.println("Password was reset successfully");
                break;
            }
        }
    }












//    public void resetpass(String E, String pass)
//    {
//        Scanner sc=new Scanner(System.in);
//        SYSTEM system = new SYSTEM();
//
//        boolean found = false;
//        for (User u : User.users)
//        {
//            u.ViewAllAccounts();
//            if (u.getEmail().equals(E) && u.getPassword().equals(pass))
//            {
//                found=true;
//                String newpassword="";
//                while (true)
//                {
//                    System.out.println("Please enter your new password:");
//                    newpassword = sc.next();
//                    if (system.validate_pass(newpassword))
//                    {
//                        break;
//                    }
//                    else
//                    {
//                        System.out.println("Invalid password. Please enter a password with at least one uppercase letter, one lowercase letter, one number, one symbol, and a length of at least 8 characters.");
//                    }
//                }
//                u.SetPass(newpassword);
//                u.ViewAllAccounts();
//            }
//        }
//        if (!found)
//        {
//            System.out.println("User was not found,Please Choose to reset password again with a correct email and old password");
//        }
//
//
//
//
//
////        boolean found = false;
////        for (User u : User.users)
////        {
////            u.ViewAllAccounts();
////            if (u.getEmail().equals(E) && u.getPassword().equals(pass))
////            {
////                System.out.println("please enter your new password");
////                String newpassword = sc.next();
////                while (!system.validate_pass(newpassword))
////                {
////                    newpassword = sc.next();
////                    continue;
////                }
////                u.SetPass(newpassword);
////                u.ViewAllAccounts();
////                System.out.println("Password was reset successfully");
////                found=true;
////                break;
////            }
////        }
////        if (!found)
////        {
////            System.out.println("User was not found,Please Choose to reset password again with a correct email and old password");
////        }
//    }
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






