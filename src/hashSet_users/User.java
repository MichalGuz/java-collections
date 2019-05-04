package hashSet_users;

import java.time.LocalDate;

public class User {
    String name;
    String surname;
    String nick;
    LocalDate dateOfRegisty;

    public User(String name, String surname, String nick, int yearOfRegistry, int monthOfRegistry, int dayOfRegistry) {
        this.name = name;
        this.surname = surname;
        this.nick = nick;
        this.dateOfRegisty = LocalDate.of(yearOfRegistry, monthOfRegistry, dayOfRegistry);
    }

    @Override
    public int hashCode(){
        return dateOfRegisty.getYear()* 100 + dateOfRegisty.getMonthValue();
    }

    public String getName(){
        return name;
    }

    public String getSurname(){
        return surname;
    }

    public String getNick(){
        return nick;
    }

    public LocalDate getDateOfRegisty(){
        return dateOfRegisty;
    }
}
