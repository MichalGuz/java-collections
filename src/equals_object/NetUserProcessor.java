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

        NetUserEvo user11 = new NetUserEvo("John", "jj", "johny99", "029300" );
        NetUserEvo user12 = new NetUserEvo("Jim", "jimmy", "jimBeam", "029301" );
        NetUserEvo user13 = new NetUserEvo("Adam", "toto", "persona", "029302" );
        NetUserEvo user14 = new NetUserEvo("Nina", "ninoczka", "ladyn", "029303" );
        NetUserEvo user15 = new NetUserEvo("Adam", "jj", "johny99", "029300" );

    }
}