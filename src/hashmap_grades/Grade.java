package hashmap_grades;

import java.util.ArrayList;
import java.util.List;

public class Grade {
    private List<Integer> grades = new ArrayList<>();

    public void addGrade(Integer grade) {
        grades.add(grade);
    }

    public String toString() {
        String n = "";
        for (int i = 0; i < grades.size(); i++) {
            n += grades.get(i) + ", ";
        }
        return n;
    }

    public Integer sumOfGrades() {
        Integer s = 0;
        for (int i = 0; i < grades.size(); i++) {
            s += grades.get(i);
        }
        return s;
    }

    public double average() {
        double sum = 0;
        for (Integer grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }
}

