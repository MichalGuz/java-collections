package equals_object;

public class NetUserEvo {
    String name;
    String nick;
    String login;
    String numberId;

    public NetUserEvo(String name, String nick, String login, String numberId) {
        this.name = name;
        this.nick = nick;
        this.login = login;
        this.numberId = numberId;
    }

    public boolean equals(Object o) {
        final NetUserEvo n = (NetUserEvo) o;
        return this.name.equals(n.name) && this.nick.equals(n.nick) && this.login.equals(n.login) && this.numberId.equals(n.numberId);
    }
}
