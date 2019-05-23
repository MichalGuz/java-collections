package task_with_letters;

import java.util.ArrayDeque;
import java.util.Random;

public class LettersArrayDeque {
    public void createArrayDequeWithLetters() {
        ArrayDeque<Letters> letters = new ArrayDeque();
        String one = "A";

        // int counterLoops = 0;

        for (int p = 0; p < 50; p++) {

            Random generator = new Random();
            int x = generator.nextInt(50);

            String newA = "";

            for (int i = 0; i < x; i++) {
                newA += one;

                // checking how many times the loop has been run
                // counterLoops++;

                // checking value of random number
                // System.out.printf("X =" + x);
            }

            letters.offer(new Letters(p, newA));

            // printing how many times the loop has been run
            // System.out.println("\nHow many loops have been run? [" + counterLoops + "]");

            // printing value of random number
            // System.out.println(newA);
        }

        for (Letters d : letters) {
            System.out.println("[" + d.getNumber() + "] " + d.getLetter());
        }

        System.out.println("Size of collection letters = " + letters.size() + " items.");

    }
}
