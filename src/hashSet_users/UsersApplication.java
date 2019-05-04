package hashSet_users;

import java.util.HashSet;

public class UsersApplication {
    public static void main(String args[]){
        User user1 = new User("John", "Smith", "firstUser", 2019, 5, 1);

        HashSet<User> users = new HashSet<>();

        users.add(user1);
    }
}
