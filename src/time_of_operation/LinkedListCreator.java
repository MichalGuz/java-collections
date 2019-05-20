package time_of_operation;

import java.util.LinkedList;

public class LinkedListCreator {
    public void linkedListCreate(){
        LinkedList<Integer> bigLinkedList = new LinkedList<>();
        for (int i = 0; i < 1000000; i++ ) {
            bigLinkedList.add(i);
        }

        LinkedListProcessor linkedListProcessor = new LinkedListProcessor();

        System.out.println("\n");

        linkedListProcessor.timeOfAddFirstToLinkedList(bigLinkedList);
        linkedListProcessor.timeOfAddLastToLinkedList(bigLinkedList);
        linkedListProcessor.timeOfRemoveFirstFromLinkedList(bigLinkedList);
        linkedListProcessor.timeOfRemoveLastFromLinkedList(bigLinkedList);
        linkedListProcessor.timeOfGetFromMiddleOfLinkedList(bigLinkedList);
        LinkedListPrintTime linkedListPrintTime = new LinkedListPrintTime();
        linkedListPrintTime.printLinkedListTime(linkedListProcessor, bigLinkedList);
    }
}
