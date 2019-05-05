package queue;

import java.time.LocalDate;

public class Appointment {
    public Patient patient;
    public LocalDate dateOfAppointment;

    public Appointment(Patient patient, int year, int month, int day){
        this.patient = patient;
        this.dateOfAppointment = LocalDate.of(year, month, day);
    }
}
