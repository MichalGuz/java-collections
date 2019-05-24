package task_with_letters;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class ArrayListOfLetters {
    ArrayDeque<Letters> letters;
    ArrayList<Letters> even = new ArrayList<>();
    ArrayList<Letters> odd = new ArrayList<>();

    public void filterLetters(ArrayDeque<Letters> letters) {
        for (Letters iter : letters) {
            Letters x = letters.pollFirst();
            if ((x.getLetter().length() % 2) == 0) {
                even.add(x);
            } else {
                odd.add(x);
            }
        }
        System.out.println("Collection ArrayList of even contains " + even.size() + " elements.\nCollection ArrayList of odd contains " + odd.size() + " elements\n");

        System.out.println("Even:");
        for (int i = 0; i < even.size(); i++){
            System.out.println("[Numbers of letter A: " + even.get(i).getLetter().length() + "] " + even.get(i).getLetter());
        }
        System.out.println("Odd:" + odd);
    }
}
