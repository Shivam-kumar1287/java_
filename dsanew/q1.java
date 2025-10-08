package CODE.dsanew;

import java.util.HashMap;
import java.util.Map;
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
    }
}
