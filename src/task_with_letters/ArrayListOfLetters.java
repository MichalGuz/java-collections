package task_with_letters;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class ArrayListOfLetters {
    ArrayList<Letters> even = new ArrayList<>();
    ArrayList<Letters> odd = new ArrayList<>();

    public void filterLetters(ArrayDeque<Letters> letters) {
        while(letters.size()>0) {
            Letters letter = letters.poll();
            if ((letter.getLetter().length() % 2) == 0) {
                even.add(letter);
            } else {
                odd.add(letter);
            }
        }
        System.out.println("Collection ArrayList of even contains " + even.size() + " elements.\nCollection ArrayList of odd contains " + odd.size() + " elements\n");

        System.out.println("Even:");
        for (int i = 0; i < even.size(); i++){
            System.out.println("[Numbers of letter A: " + even.get(i).getLetter().length() + "] " + even.get(i).getLetter());
        }
        System.out.println("\nOdd:");
        for (int i = 0; i < odd.size(); i++){
            System.out.println("[Numbers of letter A: " + odd.get(i).getLetter().length() + "] " + odd.get(i).getLetter());
        }
    }
}
