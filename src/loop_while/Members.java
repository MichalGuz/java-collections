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


}
