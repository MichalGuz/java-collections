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

    @Override
    public long timeOfAddFirst() {
        long start1 = System.currentTimeMillis();
        numbers.add(0);
        long end1 = System.currentTimeMillis();
        return differenceOfTime = end1 - start1;
    }

    @Override
    public long timeOfAddLast() {
        long start2 = System.currentTimeMillis();
        numbers.add(numbers.size());
        long end2 = System.currentTimeMillis();
        return differenceOfTime = end2 - start2;
    }

    @Override
    public long timeOfRemoveFirst() {
        long start3 = System.currentTimeMillis();
        numbers.remove(0);
        long end3 = System.currentTimeMillis();
        return differenceOfTime = end3 - start3;
    }

    @Override
    public long timeOfRemoveLast() {
        long start4 = System.currentTimeMillis();
        numbers.remove(numbers.size() - 1);
        long end4 = System.currentTimeMillis();
        return differenceOfTime = end4 - start4;
    }
}