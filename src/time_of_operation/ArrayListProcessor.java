package time_of_operation;

import java.util.ArrayList;

public class ArrayListProcessor {

    long differenceOfTime;

    public long timeOfAddFirstToArrayList(ArrayList<Integer> list) {
        long start1 = System.currentTimeMillis();
        list.add(0,1);
        long end1 = System.currentTimeMillis();
        return differenceOfTime = end1 - start1;
    }

    public long timeOfAddLastToArrayList(ArrayList<Integer> list) {
        long start2 = System.currentTimeMillis();
        list.add(list.size());
        long end2 = System.currentTimeMillis();
        return differenceOfTime = end2 - start2;
    }

    public long timeOfRemoveFirstFromArrayList(ArrayList<Integer> list) {
        long start3 = System.currentTimeMillis();
        list.remove(0);
        long end3 = System.currentTimeMillis();
        return differenceOfTime = end3 - start3;
    }

    public long timeOfRemoveLastFromArrayList(ArrayList<Integer> list) {
        long start4 = System.currentTimeMillis();
        list.remove(list.size() - 1);
        long end4 = System.currentTimeMillis();
        return differenceOfTime = end4 - start4;
    }


}