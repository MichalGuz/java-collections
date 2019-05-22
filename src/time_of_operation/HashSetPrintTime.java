package time_of_operation;

import java.util.HashSet;

public class HashSetPrintTime {
    public void printHashSetTime( HashSetProcessor hashSetProcessor, HashSet<ItemForSet> hashSet){
           System.out.println("HasSet contains: " + hashSet.size() + " elements.");
           System.out.println("Time to add a new item to the HashSet containing " + hashSet.size() + " elements: " + hashSetProcessor.timeOfAddOneItemToHashSet(hashSet) + "[ns];");
           System.out.println("Time of adding new element to the collection containing " + hashSet.size() + " elements: " + hashSetProcessor.timeOfAddOneItemToHashSet(hashSet) + "[ns];");
           System.out.println("Time of removing an item from the collection containing " + hashSet.size() + " elements: "  + hashSetProcessor.timeOfRemoveOneItemFromHashSet(hashSet) + "[ns];");
           System.out.println("Time of removing another item from the collection containing " + hashSet.size() + " elements: " + hashSetProcessor.timeOfRemoveAnotherItemFromHashSet(hashSet) + "[ns];");
           System.out.println("Time of checking if collection of " + hashSet.size() + " elements contains an item:" + hashSetProcessor.timeOfCheckIfHashSetContains(hashSet));
           System.out.println("After all operations HashaSet contains: " + hashSet.size() + " elements.\n");
    }

}

