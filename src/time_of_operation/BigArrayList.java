package time_of_operation;

import java.util.ArrayList;

public class BigArrayList implements CollectionProcessor {
    ArrayList<Integer> numbers;
    long differenceOfTime;

    @Override
    public void createCollection() {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            numbers.add(i);
        }

        System.out.println("Size of collection 'numbers': " + numbers.size() + " elements.");
    }

}
