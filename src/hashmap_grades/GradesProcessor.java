package hashmap_grades;

import java.util.HashMap;
import java.util.Map;

public class GradesProcessor {
    public static void main (String[] args) {
        Student s1 = new Student("Ada", "Adamska", "01");
        Student s2 = new Student("Adam", "Adamski", "02");
        Student s3 = new Student("Bartosz", "Adamiak", "03");
        Student s4 = new Student("Bianka", "Bystry", "04");
        Student s5 = new Student("Cecylia", "Bystrzycka", "05");
        Student s6 = new Student("Cezary", "Cacek", "06");
        Student s10 = new Student("Marek", "Malinowski", "10");
        Student s11 = new Student("Anna", "Mikulski", "11");
        Student s12 = new Student("Jan", "Mutko", "12");
        Student s20 = new Student("Izabela", "Orska", "20");
        Student s21 = new Student("Julia", "Polak", "21");
        Student s22 = new Student("Agnieszka", "Prorok", "22");
        Student s30 = new Student("Roman","Sulima", "30");
        Student s33 = new Student("Klaudia", "Szewczyk", "33");

        Grade g1 = new Grade();
        g1.addGrade(3);
        g1.addGrade(4);
        g1.addGrade(4);
        g1.addGrade(4);

        Grade g2 = new Grade();
        g2.addGrade(3);
        g2.addGrade(4);
        g2.addGrade(5);
        g2.addGrade(4);
        g2.addGrade(3);

        Grade g3 = new Grade();
        g3.addGrade(4);
        g3.addGrade(4);
        g3.addGrade(5);
        g3.addGrade(4);
        g3.addGrade(3);

        Grade g4 = new Grade();
        g4.addGrade(5);
        g4.addGrade(4);
        g4.addGrade(3);
        g4.addGrade(4);
        g4.addGrade(4);
        g4.addGrade(5);
        g4.addGrade(4);

        Grade g5 = new Grade();
        g5.addGrade(4);
        g5.addGrade(4);
        g5.addGrade(4);
        g5.addGrade(4);
        g5.addGrade(4);

        Grade g6 = new Grade();
        g6.addGrade(4);
        g6.addGrade(4);
        g6.addGrade(3);
        g6.addGrade(3);
        g6.addGrade(3);

        Grade g10 = new Grade();
        g10.addGrade(2);
        g10.addGrade(3);
        g10.addGrade(3);
        g10.addGrade(5);
        g10.addGrade(4);

        Grade g11 = new Grade();
        g11.addGrade(4);
        g11.addGrade(5);
        g11.addGrade(5);
        g11.addGrade(4);
        g11.addGrade(5);

        Grade g12 = new Grade();
        g12.addGrade(3);
        g12.addGrade(4);
        g12.addGrade(5);
        g12.addGrade(4);

        Grade g20 = new Grade();
        g20.addGrade(1);
        g20.addGrade(2);
        g20.addGrade(1);
        g20.addGrade(3);
        g20.addGrade(2);

        Grade g21 = new Grade();
        g21.addGrade(5);
        g21.addGrade(5);
        g21.addGrade(6);
        g21.addGrade(5);
        g21.addGrade(5);

        Grade g22 = new Grade();
        g22.addGrade(4);
        g22.addGrade(3);
        g22.addGrade(4);

        Grade g30 = new Grade();
        g30.addGrade(3);
        g30.addGrade(2);
        g30.addGrade(5);
        g30.addGrade(4);

        Grade g33 = new Grade();
        g33.addGrade(4);
        g33.addGrade(5);
        g33.addGrade(5);
        g33.addGrade(4);

        HashMap<Student, Grade> grades = new HashMap<>();
        grades.put(s1, g1);
        grades.put(s2, g2);
        grades.put(s3, g3);
        grades.put(s4, g4);
        grades.put(s5, g5);
        grades.put(s6, g6);
        grades.put(s10, g10);
        grades.put(s11, g11);
        grades.put(s12, g12);
        grades.put(s20, g20);
        grades.put(s21, g21);
        grades.put(s22, g22);
        grades.put(s30, g30);
        grades.put(s33, g33);

        }
}
