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
    }
}
