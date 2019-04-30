package hashmap_grades;

public class Student {
    String name;
    String surname;
    String numberID;

    public Student(String name, String surname, String numberID) {
        this.name = name;
        this.surname = surname;
        this.numberID = numberID;
    }

    @Override
    public boolean equals(Object o){
        final Student s = (Student) o;
        return this.name.equals(s.name) && this.surname.equals(s.surname) && this.numberID.equals(s.numberID);
    }

    public int hashCode() {
        return Integer.parseInt(numberID.substring(0,1));
    }


}
