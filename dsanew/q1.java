package CODE.dsanew;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
class User {
    private int id;
    private String name;
    private String email;

    public User(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void display() {
        System.out.println("ID: " + getId() + ", Name: " + getName() + ", Email: " + getEmail());
        System.out.println("--------------------------");
    }
}
class UserDatabase {
    private Map<Integer, User> userdata;

    public UserDatabase() {
        userdata = new HashMap<>();
        initializeSampleData();
    }

    public void addUser(User user) {
        userdata.put(user.getId(), user);
        System.out.println("User added successfully: " + user.getName());
    }

    public User getUser(int id) {
        return userdata.get(id);
    }

    private void initializeSampleData() {
        addUser(new User(111, "John Doe", "john.doe@example.com"));
        addUser(new User(222, "Jane Smith", "jane.smith@example.com"));
        addUser(new User(123, "Bob Brown", "sdf"));   
    }
    public User searchUserById(int id) {
        return userdata.get(id);
    }
    public User delUserById(int id) {
        return userdata.remove(id);
    }
    public void displayAllUsers() {
        for (User user : userdata.values()) {
            user.display();
        }
    }
    public User updateUser(int id, String name, String email) {
        User user = userdata.get(id);
        if (user != null) {
            User updatedUser = new User(id, name, email);
            userdata.put(id, updatedUser);
            return updatedUser;
        }
        return null;
    }
}

public class q1 {
    public static void main(String[] args) {
        UserDatabase db = new UserDatabase();

        db.addUser(new User(333, "Alice Johnson", "alice.j@example.com"));

        User user1 = db.getUser(111);
        if (user1 != null) user1.display();

        User user2 = db.getUser(333);
        if (user2 != null) user2.display();
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu:");
        System.out.println("1. Add User");
        System.out.println("2. Search User by ID");
        System.out.println("3. Delete User by ID");
        System.out.println("4. Display All Users");
        System.out.println("5. Update User by ID");
        System.err.println("0 for exit");
        System.out.println("Enter user Choice:");
        int ch= sc.nextInt();
        switch(ch){
            case 1:
                System.out.println("Enter user id:");
                int id3 = sc.nextInt();
                System.out.println("Enter user name:");
                String name = sc.next();
                System.out.println("Enter user email:");
                String email = sc.next();
                db.addUser(new User(id3, name, email));
                break;
            case 2:
                System.out.println("Enter user id to search:");
                int id4 = sc.nextInt();
                System.out.println("Search result:"+db.searchUserById(id4));
                break;
            case 3:
                System.out.println("Enter user id to delete:");
                int id5 = sc.nextInt();
                System.out.println("Delete result:"+db.delUserById(id5));
                break;
            case 4:
                System.out.println("All users in the database:");
                db.displayAllUsers();
                break;
            case 5:
                System.out.println("Enter user id to update:");
                int id6 = sc.nextInt();
                System.out.println("Enter new name:");
                String newName = sc.next();
                System.out.println("Enter new email:");
                String newEmail = sc.next();
                System.out.println("Update result:"+db.updateUser(id6, newName, newEmail));
                break;  
            default:
                System.out.println("Invalid choice");
                break;
        }

        sc.close();
    }
}
