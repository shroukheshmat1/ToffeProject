import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class User {
    private String name;
    private String email;
    private String phone;
    private String address;
    private String password;

    void SetPass(String pass) {
        this.password = pass;
    }

    public static ArrayList<User> users = new ArrayList<User>();
    Hashtable<String, String> Emails_Pass = new Hashtable<String, String>();
    SYSTEM sys = new SYSTEM();

    public User(String nme, String emil, String ph, String addr, String passw) {
        this.name = nme;
        this.email = emil;
        this.phone = ph;
        this.address = addr;
        this.password = passw;
    }

    public String getPassword() {
        return this.password;
    }

    public String getEmail() {
        return this.email;
    }

    public void createaccount(User user) {
        users.add(user);
        System.out.println("User added successfully!");
        System.out.println("Welcome to Our System!");
         ViewAllAccounts();

    }

    public void SavedData(User user) {
        Emails_Pass.put(this.getEmail(), this.getPassword());
    }

    public void PRINT() {
        Enumeration<String> key = Emails_Pass.keys();
        while (key.hasMoreElements()) {
            String NEXT = key.nextElement();
            System.out.println("Email: " + NEXT + " , Password: " + Emails_Pass.get(NEXT));
        }
    }

    public void ViewAllAccounts() {
        for (int id = 0; id < users.size(); id++) {
            System.out.println("Name of User no " + (id + 1) + " is: " + users.get(id).name);
            System.out.println("Email of User no " + (id + 1) + " is: " + users.get(id).email);
            System.out.println("Phone number of User no " + (id + 1) + " is: " + users.get(id).phone);
            System.out.println("Address of User no " + (id + 1) + " is: " + users.get(id).address);
            System.out.println("Password of User no " + (id + 1) + " is: " + users.get(id).password);
        }
    }

}
