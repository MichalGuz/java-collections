package list_as_parameter;

import java.util.ArrayList;
import java.util.Random;

public class ListAsParameter {
    public static void main(String[] args) {
        ArrayList<Integer> theList = new ArrayList<>();
        Random randomGenerator = new Random();
        for (int i = 0; i  < 200; i++){
            theList.add(randomGenerator.nextInt(100));
            OddEliminator oddEliminator  = new OddEliminator();
            oddEliminator.printEven(theList);
        }
    }
}
