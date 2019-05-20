package time_of_operation;

import java.util.HashMap;

public class HashMapNumberCreator {


    public void hashMapWithNewBusketsCreate() {
        HashMap<Number, String> bigHashMapNumber = new HashMap<Number, String>();

        String value = "text";

        for (int i = 1; i < 1000000; i++) {
            bigHashMapNumber.put(new Number(i, i), value + i);
        }

        HashMapNumberProcessor hashMapNumberProcessor = new HashMapNumberProcessor();
        HashMapNumberPrintTime hashMapNumberPrintTime = new HashMapNumberPrintTime();

        hashMapNumberProcessor.timeOfAddOneItemToHashMapNumber(bigHashMapNumber);
        hashMapNumberProcessor.timeOfAddAnotherItemToHashMapNumber(bigHashMapNumber);
        hashMapNumberProcessor.timeOfRemoveOneItemFromHashMapNumber(bigHashMapNumber);
        hashMapNumberProcessor.timeOfRemoveAnotherItemFromHashMapNumber(bigHashMapNumber);
        hashMapNumberProcessor.timeOfGetAnotherItemFromHashMapNumber(bigHashMapNumber);

        hashMapNumberPrintTime.printHashMapNumberTime(hashMapNumberProcessor, bigHashMapNumber);

    }
}