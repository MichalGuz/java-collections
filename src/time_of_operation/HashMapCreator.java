package time_of_operation;

import java.util.HashMap;

public class HashMapCreator {

    public void hashMapCreate(){
        HashMap<Integer, String> bigHashMap = new HashMap<Integer, String>();

        String value = "text";
        for(int i = 1; i < 1000000; i++){
            bigHashMap.put(i, value + i);
        }

        HashMapIntegerProcessor hashMapIntegerProcessor = new HashMapIntegerProcessor();

        hashMapIntegerProcessor.timeOfAddOneItemToHashMapInteger(bigHashMap);
        hashMapIntegerProcessor.timeOfAddAnotherItemToHashMapInteger(bigHashMap);
        hashMapIntegerProcessor.timeOfGetAnotherItemFromHashMapInteger(bigHashMap);
        hashMapIntegerProcessor.timeOfRemoveOneItemFromHashMapInteger(bigHashMap);
        hashMapIntegerProcessor.timeOfRemoveAnotherItemFromHashMapInteger(bigHashMap);

        HashMapIntegerPrintTime hashMapIntegerPrintTime = new HashMapIntegerPrintTime();

        hashMapIntegerPrintTime.printHashMapIntegerTime(hashMapIntegerProcessor,bigHashMap);

    }

}
