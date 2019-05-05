package queue;

import java.util.concurrent.ThreadPoolExecutor;

public class PatientsQueue {
    public static void main(String[] args) {
        Patient patient1 = new Patient("Bob", "Hopkins", 66, "195311240143");
        Patient patient2 = new Patient("Sarah", "Atkins", 54, "196502140023");
        Patient patient3 = new Patient("Lisa", "Morgan", 34, "19850906015");

        Appointment appointment1 = new Appointment(patient1, 2019, 05, 06);
        Appointment appointment2 = new Appointment(patient2, 2019, 05, 06);
        Appointment appointment3 = new Appointment(patient3, 2019, 05,07);
        Appointment appointment4 = new Appointment(patient1, 2019, 05, 20);
        Appointment appointment5 = new Appointment(patient3, 2019, 05,21);




    }
}
