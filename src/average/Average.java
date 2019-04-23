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

        double sum = 0;
        for(int s = 0; s < values.length; s++ ) {
            double element = 0;
            element += values[s];
            sum += element;

            System.out.println("Growing sum of values = " + sum);
        }

        double average = sum / values.length;
        System.out.println("The sum of values is: " + sum);
        System.out.println("The average of values in an array is: " + average);
    }
}
