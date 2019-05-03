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
}

