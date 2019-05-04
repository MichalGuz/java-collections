package hashSet_users;

import java.util.HashSet;

public class UsersApplication {
    public static void main(String args[]) {
        User user1 = new User("John", "Smith", "firstUser", 2019, 5, 1);
        User user2 = new User("Mary", "Jones", "MaryJ", 2019, 3, 1);
        User user3 = new User("Zack", "Lowe", "bigZ", 2019, 1, 31);
        User user4 = new User("Jane", "Abrams", "jan99", 2019, 3, 8);
        User user5 = new User("Alan", "Parkinson", "alpar", 2019, 2, 1);
        User user6 = new User("Mia", "barton", "miab", 2019, 4, 5);

        HashSet<User> users = new HashSet<>();

        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
        users.add(user6);
    }
}
