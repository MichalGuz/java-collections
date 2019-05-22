package time_of_operation;

import java.util.HashMap;

public class HashMapNumberPrintTime {
    public void printHashMapNumberTime(HashMapNumberProcessor hashMapNumberProcessor, HashMap<Number, String> hashMap) {
        System.out.println("HashMap contains: " + hashMap.size() + " elements.");
        System.out.println("Time to add a new item with an index 0 to the HashMap containing " + hashMap.size() + " elements: " + hashMapNumberProcessor.timeOfAddOneItemToHashMapNumber(hashMap) + "[ns];");
        System.out.println("Time of adding new item with the highest index in the collection containing " + hashMap.size() + " elements: " + hashMapNumberProcessor.timeOfAddAnotherItemToHashMapNumber(hashMap) + "[ns];");
        System.out.println("Time of removing an item with index 0 from the collection containing " + hashMap.size() + " elements: " + hashMapNumberProcessor.timeOfRemoveOneItemFromHashMapNumber(hashMap) + "[ns];");
        System.out.println("Time of removing an item with the highest index in the collection containing " + hashMap.size() + " elements: " + hashMapNumberProcessor.timeOfRemoveAnotherItemFromHashMapNumber(hashMap) + "[ns];");
        System.out.println("Time of getting an item with index equals a half size of the collection containing " + hashMap.size() + " elements:" + hashMapNumberProcessor.timeOfGetAnotherItemFromHashMapNumber(hashMap));
        System.out.println("After all operations HashMap contains: " + hashMap.size() + " elements.\n");

    }
}
