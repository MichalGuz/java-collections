package time_of_operation;

import java.util.LinkedList;

public class LinkedListPrintTime {
    public void printLinkedListTime( LinkedListProcessor linkedListProcessor, LinkedList<Integer> linkedList){
        System.out.println("LinkedList contains: " + linkedList.size() + " elements.");
        System.out.println("Time to add a new item to the beginning of the LinkedList containing " + linkedList.size() + " elements: " + linkedListProcessor.timeOfAddFirstToLinkedList(linkedList) + "[ns];");
        System.out.println("Time of adding new element at the end of collection containing " + linkedList.size() + " elements: " + linkedListProcessor.timeOfAddLastToLinkedList(linkedList) + "[ns];");
        System.out.println("Time of removing an item from the beginning of collection containing " + linkedList.size() + " elements: "  + linkedListProcessor.timeOfRemoveFirstFromLinkedList(linkedList) + "[ns];");
        System.out.println("Time of removing an item from the end of collection containing " + linkedList.size() + " elements: " + linkedListProcessor.timeOfRemoveLastFromLinkedList(linkedList) + "[ns];");
        System.out.println("After all operations LinkedList contains: " + linkedList.size() + " elements.");
    }
}
