package lists;

import java.util.*;

public class LastRemoved {
    public void lastRemovedProcess(){
        ArrayList<String> members = new ArrayList<>();
        String member = "Member";
        for(int i = 0; i < 20; i++) {
            members.add(member + i);
            System.out.println(members.get(i));
        }

        System.out.println("Removing last object from list");
        members.remove(members.size() - 1);

        System.out.println("Number of members: " + members.size());
        System.out.println("List of members: ");
        for(String memb: members) {
            System.out.println(memb);
        }
    }
}
