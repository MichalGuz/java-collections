package queue;

import java.util.ArrayDeque;

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

        ArrayDeque<Appointment> appointments = new ArrayDeque<Appointment>();

        System.out.println("New queue has been created. It's size: " + appointments.size());

        appointments.offer(appointment1);
        appointments.offer(appointment2);
        appointments.offer(appointment3);
        appointments.offer(appointment4);
        appointments.offer(appointment5);

        System.out.println("Queue has been filled. It's size: " + appointments.size() + "\n");

        System.out.println("First appointment in queue is: " + appointments.peek());

        Appointment temporaryAppointment1;
        temporaryAppointment1 = appointments.poll();

        System.out.println("\nAn appointment has been finished:\n " + temporaryAppointment1);
        System.out.println("\nAfter the first appointment, the size of queue is: " + appointments.size());

        Appointment temporaryAppointment2;
        temporaryAppointment2 = appointments.poll();

        System.out.println("\nAn appointment has been finished:\n " + temporaryAppointment2);
        System.out.println("\nAfter the next appointment, the size of queue is: " + appointments.size());

        Appointment temporaryAppointment3;
        temporaryAppointment3 = appointments.poll();

        System.out.println("\nAn appointment has been finished:\n " + temporaryAppointment3);
        System.out.println("\nAfter the next appointment, the size of queue is: " + appointments.size());

        Appointment temporaryAppointment4;
        temporaryAppointment4 = appointments.poll();

        System.out.println("\nAn appointment has been finished:\n " + temporaryAppointment4);
        System.out.println("\nAfter the next appointment, the size of queue is: " + appointments.size());

        Appointment temporaryAppointment5;
        temporaryAppointment5 = appointments.poll();

        System.out.println("\nAn appointment has been finished:\n " + temporaryAppointment5);
        System.out.println("\nAfter the next appointment, the size of queue is: " + appointments.size());
    }
}
