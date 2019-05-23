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
            if ((letters.pollFirst().getLetter().length() % 2) == 0) {
                even.add(x);
            } else {
                odd.add(x);
            }
        }

        System.out.println("Collection ArrayList of even contains " + even.size() + " elements.\nCollection ArrayList of odd contains " + odd.size() + " elements\n");
        System.out.println("Even: " + even);
        System.out.println("Odd:" + odd);
    }


}
