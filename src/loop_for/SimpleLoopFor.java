package loop_for;

import java.lang.*;

public class SimpleLoopFor {
    public static void main (String[] args) throws java.lang.Exception {
        String[] customers = new String[5];
        customers[0] = "Jan Adamski";
        customers[1] = "Adam Kowalski";
        customers[2] = "Barbara Nowak";
        customers[3] = "Dorota Baranowska";
        customers[4] = "Ewa Janiak";
        for(int i=0; i<5; i++) {
            System.out.println("Array element names[" + i + "] = " + customers[i]);
        }

        System.out.println("Number of customers: " + customers.length);
    }
}
