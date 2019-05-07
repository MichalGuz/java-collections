package loop_while_sum;

import java.util.Random;

public class Sum {
    public static void main(String[] args) {
        int sumA = 1000;
        int sumB = 0;
        Random randomA = new Random();
        Random randomB = new Random();
        int attemptCounter =0;
        while(sumA > sumB){
            int a = randomA.nextInt(10);
            int b = randomB.nextInt(50);
            sumA = sumA + a;
            sumB = sumB + b;
        }
    }
}
