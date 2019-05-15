package time_of_operation;

import java.util.ArrayList;

public class BigArrayList {
    BigArrayList b;
    long differenceOfTime;

//    @Override
//    public void createCollection() {
//        ArrayList<Integer> numbers = new ArrayList<>();
//        for (int i = 0; i < 1000000; i++) {
//            numbers.add(i);
//        }
//
//        System.out.println("Size of collection 'numbers': " + numbers.size() + " elements.");
//    }

    public void printSize(){
        System.out.println("size of list: " + list.size());
    }

    public long timeOfAddFirst(ArrayList<Integer> list) {
        long start1 = System.currentTimeMillis();
        list.add(0,1);
        long end1 = System.currentTimeMillis();
        return differenceOfTime = end1 - start1;
    }

    @Override
    public long timeOfAddLast() {
        long start2 = System.currentTimeMillis();
        list.add(list.size());
        long end2 = System.currentTimeMillis();
        return differenceOfTime = end2 - start2;
    }

    @Override
    public long timeOfRemoveFirst() {
        long start3 = System.currentTimeMillis();
        list.remove(0);
        long end3 = System.currentTimeMillis();
        return differenceOfTime = end3 - start3;
    }

    @Override
    public long timeOfRemoveLast() {
        long start4 = System.currentTimeMillis();
        list.remove(list.size() - 1);
        long end4 = System.currentTimeMillis();
        return differenceOfTime = end4 - start4;
    }

    @Override
    public void print() {
        System.out.println("[Big ArrayList] = " + list.size() + " elements.");
        System.out.println("Time of adding new element at the beginning of collection [ms]:" + b.timeOfAddFirst());
        System.out.println("Time of adding new element at the end of collection [ms]:" + b.timeOfAddLast());
        System.out.println("Time of removing an element from the beginning of collection [ms]:" + b.timeOfAddFirst());
        System.out.println("Time of removing an element from the end of collection [ms]:" + b.timeOfAddLast());
    }

}