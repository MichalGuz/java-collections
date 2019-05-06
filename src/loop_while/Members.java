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


}
