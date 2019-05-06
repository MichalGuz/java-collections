package loop_while;

import java.time.LocalDate;

public class Members {
    String name;
    String surname;
    LocalDate birthDate;

    public Members(String name, String surname, int year, int month, int day) {
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
        Members m = (Members)o;
        return (name.equals(m.getName())) && (surname.equals(m.getSurname()))&& (birthDate.getYear()== m.getBirthDate().getYear()) && (birthDate.getMonthValue() == m.getBirthDate().getMonthValue()) && (birthDate.getDayOfMonth() == m.getBirthDate().getDayOfYear();
    }

}
