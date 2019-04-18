package average;

import java.lang.*;

public class Average {
    public static void main (String[] args) throws java.lang.Exception {
        double[] values = new double[20];
        double basic = 0;
        for(int i = 0; i < 20; i++) {
            values[i] = basic++;
            System.out.println("Array element values[" + i + "] = " + values[i]);
        }
       double sum = values[0] + values[1] + values[2] + values[3] + values[4] + values[5] + values[6] + values[7] + values[8] + values[9] + + values[10] + values[11] + values[12] + values[13] + values[14] + values[15] + values[16] + values[17] + values[18] + values[19];
       double average = sum / values.length;
       System.out.println("The sum of values is: " + sum);
       System.out.println("The average of values in an array is: " + average);
    }
}
