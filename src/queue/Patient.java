package queue;

public class Patient {
    public String name;
    public String surname;
    public int age;
    public int medicalInsuranceNumber;

    public Patient(String name, String surname, int age, int medicalInsuranceNumber){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.medicalInsuranceNumber = medicalInsuranceNumber;
    }
}