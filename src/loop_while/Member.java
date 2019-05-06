package loop_while;

import java.time.LocalDate;

public class Member {
    String name;
    String surname;
    LocalDate birthDate;

    public Member(String name, String surname, int year, int month, int day) {
        this.name = name;
        this.surname = surname;
        this.birthDate = LocalDate.of(year, month, day);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    @Override
    public int hashCode(){
        return birthDate.getYear() *100 + birthDate.getMonthValue();
    }

    @Override
    public boolean equals(Object o){
        Member m = (Member)o;
        return (name.equals(m.getName())) && (surname.equals(m.getSurname()))&& (birthDate.getYear()== m.getBirthDate().getYear()) && (birthDate.getMonthValue() == m.getBirthDate().getMonthValue()) && (birthDate.getDayOfMonth() == m.getBirthDate().getDayOfYear());
    }

    @Override
    public String toString(){
        return name + " " + surname + " , born " + birthDate;
    }
}
