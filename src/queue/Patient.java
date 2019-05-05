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

    public String getName(){
        return name;
    }

    public String getSurname(){
        return surname;
    }

    public int getAge(){
        return age;
    }

    public int getMedicalInsuranceNumber(){
        return medicalInsuranceNumber;
    }

    @Override
    public String toString(){
        return "Patient: " + name + " " + surname + " [" + age + "], MIN: " + medicalInsuranceNumber;
    }
}