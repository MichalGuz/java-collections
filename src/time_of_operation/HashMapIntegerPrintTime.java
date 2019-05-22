package time_of_operation;

import java.util.HashMap;

public class HashMapIntegerPrintTime {
    public void printHashMapIntegerTime(HashMapIntegerProcessor hashMapIntegerProcessor, HashMap<Integer, String> hashMap){
        System.out.println("HashMap contains: " + hashMap.size() + " elements.");
        System.out.println("Time of add a new item with an index 0 to the HashMap containing " + hashMap.size() + " elements: " + hashMapIntegerProcessor.timeOfAddOneItemToHashMapInteger(hashMap) + "[ns];");
        System.out.println("Time of adding new item with the highest index in the collection containing " + hashMap.size() + " elements: " + hashMapIntegerProcessor.timeOfAddAnotherItemToHashMapInteger(hashMap) + "[ns];");
        System.out.println("Time of removing an item with index 0 from the collection containing " + hashMap.size() + " elements: "  + hashMapIntegerProcessor.timeOfRemoveOneItemFromHashMapInteger(hashMap) + "[ns];");
        System.out.println("Time of removing an item with the highest index in the collection containing " + hashMap.size() + " elements: " + hashMapIntegerProcessor.timeOfRemoveAnotherItemFromHashMapInteger(hashMap) + "[ns];");
        System.out.println("Time of getting an item with index equals a half size of the collection containing " + hashMap.size() + " elements:" + hashMapIntegerProcessor.timeOfGetAnotherItemFromHashMapInteger(hashMap));
        System.out.println("After all operations HashMap contains: " + hashMap.size() + " elements.\n");
    }
}

