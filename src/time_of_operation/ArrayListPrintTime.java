package time_of_operation;

import java.util.ArrayList;

public class ArrayListPrintTime {
    public void printArrayList(ArrayListProcessor arrayListProcessor, ArrayList<Integer> list) {
        System.out.println("ArrayList contains: " + list.size() + " elements.");
        System.out.println("Time to add a new item to the beginning of the ArrayList containing " + list.size() + " elements: " + arrayListProcessor.timeOfAddFirstToArrayList(list) + " [ns];");
        System.out.println("Time of adding new element at the end of collection containing " + list.size() + " elements: " + arrayListProcessor.timeOfAddLastToArrayList(list) + " [ns];");
        System.out.println("Time of removing an item from the beginning of collection containing " + list.size() + " elements: "  + arrayListProcessor.timeOfRemoveFirstFromArrayList(list) + " [ns];");
        System.out.println("Time of removing an item from the end of collection containing " + list.size() + " elements: " + arrayListProcessor.timeOfRemoveLastFromArrayList(list) + " [ns];");
        System.out.println("Time of getting an item from the middle of collection containing " + list.size() + " elements:" + arrayListProcessor.timeOfGetFromMiddleOfArrayList(list) + " [ns]");
        System.out.println("After all operations ArrayList contains: " + list.size() + " elements.\n");}
}
