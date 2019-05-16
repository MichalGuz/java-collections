package time_of_operation;

import java.util.ArrayList;
import java.util.LinkedList;

public class TimeComparison {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            numbers.add(i);
        }

        ArrayListProcessor arrayListProcessor = new ArrayListProcessor();
//        ArrayListProcessor processor = new ArrayListProcessor();
        arrayListProcessor.timeOfAddFirstToArrayList(numbers);
        arrayListProcessor.timeOfAddLastToArrayList(numbers);
        arrayListProcessor.timeOfRemoveFirstFromArrayList(numbers);
        arrayListProcessor.timeOfRemoveLastFromArrayList(numbers);

        ArrayListPrintTime arrayListPrintTime = new ArrayListPrintTime();
        arrayListPrintTime.printArrayList(arrayListProcessor,numbers);

        ArrayList<Integer> numbers2 = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            numbers2.add(i);
        }

        System.out.println("\n");

        arrayListProcessor.timeOfAddFirstToArrayList(numbers2);
        arrayListProcessor.timeOfAddLastToArrayList(numbers2);
        arrayListProcessor.timeOfRemoveFirstFromArrayList(numbers2);
        arrayListProcessor.timeOfRemoveLastFromArrayList(numbers2);

        arrayListPrintTime.printArrayList(arrayListProcessor,numbers2);

//        LinkedList<Integer> bigLinkedList = new LinkedList<>();
//        for (int i = 0; i < 1000000; i++ ) {
//            bigLinkedList.add(i);
//        }
//
//        LinkedListProcessor linkedListProcessor = new LinkedListProcessor();
//
//        System.out.println("\n");
//

    }
}
