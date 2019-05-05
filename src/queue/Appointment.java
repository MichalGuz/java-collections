package queue;

import java.time.LocalDate;

public class Appointment {
    public Patient patient;
    public LocalDate dateOfAppointment;

    public Appointment(Patient patient, int year, int month, int day){
        this.patient = patient;
        this.dateOfAppointment = LocalDate.of(year, month, day);
    }

    public Patient getPatient(){
        return patient;
    }

    public LocalDate getDateOfAppointment(){
        return dateOfAppointment;
    }

    @Override
    public String toString(){
        return "Made appointment: " + dateOfAppointment + "\n" + "patient: " + patient;
    }
}

