package time_of_operation;

import java.util.ArrayList;

public class ArrayListProcessor {

    long differenceOfTime;

    public long timeOfAddFirstToArrayList(ArrayList<Integer> list) {
        long start1 = System.nanoTime();
        list.add(0,1);
        long end1 = System.nanoTime();
        return differenceOfTime = end1 - start1;
    }

    public long timeOfAddLastToArrayList(ArrayList<Integer> list) {
        long start2 = System.nanoTime();
        list.add(list.size());
        long end2 = System.nanoTime();
        return differenceOfTime = end2 - start2;
    }

    public long timeOfRemoveFirstFromArrayList(ArrayList<Integer> list) {
        long start3 = System.nanoTime();
        list.remove(0);
        long end3 = System.nanoTime();
        return differenceOfTime = end3 - start3;
    }

    public long timeOfRemoveLastFromArrayList(ArrayList<Integer> list) {
        long start4 = System.nanoTime();
        list.remove(list.size() - 1);
        long end4 = System.nanoTime();
        return differenceOfTime = end4 - start4;
    }

    public long timeOfGetFromMiddleOfArrayList(ArrayList<Integer> list) {
        long start5 = System.nanoTime();
        list.get((list.size() / 2));
        long end5 = System.nanoTime();
        return differenceOfTime = end5 - start5;
    }

}