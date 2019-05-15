package time_of_operation;

import java.util.ArrayList;

public class TimeComparison {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            numbers.add(i);
        }

        ArrayListProcessor processor = new ArrayListProcessor();
        processor.timeOfAddFirstToArrayList(numbers);
        processor.timeOfAddLastToArrayList(numbers);
        processor.timeOfRemoveFirstFromArrayList(numbers);
        processor.timeOfRemoveLastFromArrayList(numbers);

        ArrayListProcessor arrayListProcessor = new ArrayListProcessor();

        ArrayListPrintTime arrayListPrintTime = new ArrayListPrintTime();
        arrayListPrintTime.printArrayList(arrayListProcessor,numbers);

    }
}
