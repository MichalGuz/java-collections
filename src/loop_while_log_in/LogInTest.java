package loop_while_log_in;

import java.util.Random;

public class LogInTest {
    public static void main(String[] args) {
        boolean isLogged = false;
        int loopCounter = 0;
        Random randomGenerator = new Random();
        while (!isLogged) {
            loopCounter++;
            System.out.println("Waiting for the user to sign in [attempt #" + loopCounter + "]");
            if (randomGenerator.nextInt(100) > 90) {
                isLogged = true;
            }
        }
    }
}

