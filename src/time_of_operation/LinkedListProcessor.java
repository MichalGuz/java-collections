package time_of_operation;

import java.util.LinkedList;

public class LinkedListProcessor {
    LinkedListProcessor linkedListProcessor;

    long differenceOfTime;

    public long timeOfAddFirstToLinkedList(LinkedList<Integer> linkedList){
        long start1 = System.currentTimeMillis();
        linkedList.add(0);
        long end1 = System.currentTimeMillis();
        return differenceOfTime = end1 - start1;
    }

    public long timeOfAddLastToLinkedList(LinkedList<Integer> linkedList){
        long start2 = System.currentTimeMillis();
        linkedList.add((linkedList.size() - 1));
        long end2 = System.currentTimeMillis();
        return differenceOfTime = end2 - start2;
    }

    public long timeOfRemoveFirstFromLinkedList(LinkedList<Integer> linkedList){
        long start3 = System.currentTimeMillis();
        linkedList.remove(0);
        long end3 = System.currentTimeMillis();
        return differenceOfTime = end3 - start3;
    }

    public long timeOfRemoveLastFromLinkedList(LinkedList<Integer> linkedList){
        long start4 = System.currentTimeMillis();
        linkedList.remove((linkedList.size() - 1));
        long end4 = System.currentTimeMillis();
        return differenceOfTime = end4 - start4;
    }
}
