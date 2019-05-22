package time_of_operation;

import java.util.HashSet;

public class HashSetPrintTime {
    public void printHashSetTime( HashSetProcessor hashSetProcessor, HashSet<ItemForSet> hashSet){
           System.out.println("HasSet contains: " + hashSet.size() + " elements.");
           System.out.println("Time to add a new item to the beginning of the HashSet containing " + hashSet.size() + " elements: " + hashSetProcessor.timeOfAddOneItemToHashSet(hashSet) + "[ns];");
           System.out.println("Time of adding new element at the end of collection containing " + hashSet.size() + " elements: " + hashSetProcessor.timeOfAddOneItemToHashSet(hashSet) + "[ns];");
           System.out.println("Time of removing an item from the beginning of collection containing " + hashSet.size() + " elements: "  + hashSetProcessor.timeOfRemoveOneItemFromHashSet(hashSet) + "[ns];");
           System.out.println("Time of removing an item from the end of collection containing " + hashSet.size() + " elements: " + hashSetProcessor.timeOfRemoveAnotherItemFromHashSet(hashSet) + "[ns];");
           System.out.println("Time of getting an item from the middle of collection containing " + hashSet.size() + " elements:" + hashSetProcessor.timeOfCheckIfHashSetContains(hashSet));
           System.out.println("After all operations HashaSet contains: " + hashSet.size() + " elements.\n");
    }

}

