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


}
