package hashSet_users;

import java.util.HashSet;

public class UsersApplication {
    public static void main(String args[]) {
        User user1 = new User("John", "Smith", "firstUser", 2018, 5, 1);
        User user2 = new User("Mary", "Jones", "MaryJ", 2019, 3, 1);
        User user3 = new User("Zack", "Lowe", "bigZ", 2019, 1, 31);
        User user4 = new User("Jane", "Abrams", "jan99", 2019, 3, 8);
        User user5 = new User("Alan", "Parkinson", "alpar", 2019, 2, 1);
        User user6 = new User("Mia", "Barton", "miab", 2019, 4, 5);

        HashSet<User> users = new HashSet<>();

        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
        users.add(user6);

        System.out.println("Is the user5 in the set? [" + users.contains(user5) + "]\n");

        System.out.println("Number of users: " + users.size() + "\n");

        //first method for display users' data in console (without date of registry)
        int n = 1;
        for (User action : users) {
            System.out.println("User" + " " + action.getName() + " " + action.getSurname() + " = hashCode" + action.hashCode() + ", [" + n + "]" );
            n++;
        }

        //second method for display users' data in console
        System.out.println("\nInformation about users: \n");
        for(User theUsers: users){
            System.out.println(theUsers);
        }
    }
}
