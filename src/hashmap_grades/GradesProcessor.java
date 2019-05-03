package hashmap_grades;

import java.util.HashMap;

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

        Grade g1 = new Grade(4,3,4,4,3,5,5,3,4,3,5,5,3,4,4);
        Grade g2 = new Grade(3,4,4,4,4,4,2,3,4,2,3,4,5,5,5);
        Grade g3 = new Grade(5,4,3,5,5,4,4,3,4,3,3,3,2,2,5);
        Grade g4 = new Grade(5,5,5,5,5,5,5,5,4,5,5,5,5,5,4);
        Grade g5 = new Grade(5,5,5,5,5,5,5,5,5,5,5,5,5,5,5);
        Grade g6 = new Grade(4,3,4,3,4,4,3,3,3,2,4,4,4,5,5);
        Grade g10 = new Grade(3,3,3,5,5,5,5,4,4,4,5,5,4,5,5);
        Grade g11 = new Grade(2,2,3,3,2,4,2,2,2,4,4,4,5,5,5);
        Grade g12 = new Grade(4,2,3,2,4,5,5,5,5,2,2,2,4,4,5);
        Grade g20 = new Grade(3,3,4,3,5,3,4,3,2,4,4,4,5,5,5);
        Grade g21 = new Grade(4,4,3,4,3,4,3,3,5,3,4,5,5,5,5);
        Grade g22 = new Grade(5,5,5,5,5,5,5,4,4,4,4,4,5,5,5);
        Grade g30 = new Grade(4,4,4,4,4,5,5,5,3,3,3,4,5,5,5);
        Grade g33 = new Grade(2,3,3,3,3,2,2,2,2,3,3,3,4,4,5);

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
