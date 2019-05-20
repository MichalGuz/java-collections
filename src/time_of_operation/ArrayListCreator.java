package time_of_operation;

import java.util.ArrayList;

public class ArrayListCreator {
    public void arrayListCreate(){
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            numbers.add(i);
        }

        ArrayListProcessor arrayListProcessor = new ArrayListProcessor();
        arrayListProcessor.timeOfAddFirstToArrayList(numbers);
        arrayListProcessor.timeOfAddLastToArrayList(numbers);
        arrayListProcessor.timeOfRemoveFirstFromArrayList(numbers);
        arrayListProcessor.timeOfRemoveLastFromArrayList(numbers);
        arrayListProcessor.timeOfGetFromMiddleOfArrayList(numbers);

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
        arrayListProcessor.timeOfGetFromMiddleOfArrayList(numbers2);

        arrayListPrintTime.printArrayList(arrayListProcessor,numbers2);
    }
}
