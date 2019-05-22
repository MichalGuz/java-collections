package time_of_operation;

import queue_stack_clipboard.Item;

import java.util.HashSet;

public class HashSetProcessor {
    long differenceOfTime;

    public long timeOfAddOneItemToHashSet(HashSet<ItemForSet> hashSet){
        long start1 = System.nanoTime();
        hashSet.add(new ItemForSet(0));
        long end1 = System.nanoTime();
        return differenceOfTime = end1 - start1;
    }

    public long timeOfAddAnotherItemToHashSet(HashSet<ItemForSet> hashSet) {
        long start1 = System.nanoTime();
        hashSet.add(new ItemForSet(1000001));
        long end1 = System.nanoTime();
        return differenceOfTime = end1 - start1;
    }

    public long timeOfRemoveOneItemFromHashSet(HashSet<ItemForSet> hashSet) {
        ItemForSet item = new ItemForSet(0);
        hashSet.add(item);
        long start3 = System.nanoTime();
        hashSet.remove(item);
        long end3 = System.nanoTime();
        return differenceOfTime = end3 - start3;
    }

    public long timeOfRemoveAnotherItemFromHashSet(HashSet<ItemForSet> hashSet) {
        ItemForSet anotherItem = new ItemForSet(1000000);
        hashSet.add(anotherItem);
        long start4 = System.nanoTime();
        hashSet.remove(anotherItem);
        long end4 = System.nanoTime();
        return differenceOfTime = end4 - start4;
    }

    public long timeOfCheckIfHashSetContains(HashSet<ItemForSet> hashSet){
        ItemForSet someItem = new ItemForSet(500000);
        long start5 = System.nanoTime();
        hashSet.contains(someItem);
        long end5 = System.nanoTime();
        return differenceOfTime = end5 - start5;
    }
}
