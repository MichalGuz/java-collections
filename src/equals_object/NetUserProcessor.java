package equals_object;

public class NetUserProcessor{

    public static void main (String[] args) throws java.lang.Exception {
        NetUser user1 = new NetUser("John", "jj", "johny99", "029300" );
        NetUser user2 = new NetUser("Jim", "jimmy", "jimBeam", "029301" );
        NetUser user3 = new NetUser("Adam", "toto", "persona", "029302" );
        NetUser user4 = new NetUser("Nina", "ninoczka", "ladyn", "029303" );
        NetUser user5 = new NetUser("Adam", "jj", "johny99", "029300" );

        System.out.println("user1 == user2: " + (user1 == user2));
        System.out.println("user3 == user4: " + (user3 == user4));
        System.out.println("user1 == user5: " + (user1 == user5));

        NetUserEvo user11 = new NetUserEvo("Igor", "iggy", "iggy1", "029311" );
        NetUserEvo user12 = new NetUserEvo("Mia", "m16", "m16net", "029312" );
        NetUserEvo user13 = new NetUserEvo("Lola", "loliop", "lolipop18", "029313" );
        NetUserEvo user14 = new NetUserEvo("Marc", "marco", "marcopolo", "029314" );
        NetUserEvo user15 = new NetUserEvo("Igor", "iggy", "iggy1", "029311" );

        //overriden method equal() finds double objects in collection
        System.out.println("user11 == user12: " + (user11.equals(user12)));
        System.out.println("user13 == user14: " + (user13.equals(user14)));
        System.out.println("user11 == user15: " + (user11.equals(user15)));
    }
}