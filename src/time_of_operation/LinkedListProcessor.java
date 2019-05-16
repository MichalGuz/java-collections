package time_of_operation;

import java.util.LinkedList;

public class LinkedListProcessor {
    LinkedListProcessor linkedListProcessor;

    long differenceOfTime;

    public long timeOfAddFirstToLinkedList(LinkedList<Integer> linkedList){
        long start1 = System.nanoTime();
        linkedList.add(0);
        long end1 = System.nanoTime();
        return differenceOfTime = end1 - start1;
    }

    public long timeOfAddLastToLinkedList(LinkedList<Integer> linkedList){
        long start2 = System.nanoTime();
        linkedList.add((linkedList.size() - 1));
        long end2 = System.nanoTime();
        return differenceOfTime = end2 - start2;
    }

    public long timeOfRemoveFirstFromLinkedList(LinkedList<Integer> linkedList){
        long start3 = System.nanoTime();
        linkedList.remove(0);
        long end3 = System.nanoTime();
        return differenceOfTime = end3 - start3;
    }

    public long timeOfRemoveLastFromLinkedList(LinkedList<Integer> linkedList){
        long start4 = System.nanoTime();
        linkedList.remove((linkedList.size() - 1));
        long end4 = System.nanoTime();
        return differenceOfTime = end4 - start4;
    }

    public long timeOfGetFromMiddleOfLinkedList(LinkedList<Integer> linkedList) {
        long start5 = System.nanoTime();
        linkedList.get((linkedList.size() / 2));
        long end5 = System.nanoTime();
        return differenceOfTime = end5 - start5;
    }
}
