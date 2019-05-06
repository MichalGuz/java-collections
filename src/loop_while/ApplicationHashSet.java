package loop_while;

import java.util.HashSet;
import java.util.Iterator;

public class ApplicationHashSet {
    public static void main(String[] args) {

        Member member1 = new Member("name1", "surname1", 1980, 10, 1);
        Member member2 = new Member("name2", "surname2", 1982, 1, 10);
        Member member3 = new Member("name3", "surname3", 1978, 12, 11);
        Member member4 = new Member("name4", "surname4", 1986, 9, 17);

        HashSet<Member> listOfMembers= new HashSet<Member>();
        listOfMembers.add(member1);
        listOfMembers.add(member2);
        listOfMembers.add(member3);
        listOfMembers.add(member4);

        Iterator<Member> iteratorMembers = listOfMembers.iterator();
        while (iteratorMembers.hasNext()){
            Member member = iteratorMembers.next();
            System.out.println(member);
        }
    }
}
