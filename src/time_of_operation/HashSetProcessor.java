package time_of_operation;

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
        long start1 = System.nanoTime();
        hashSet.remove(item);
        long end1 = System.nanoTime();
        return differenceOfTime = end1 - start1;
    }

    public long timeOfRemoveAnotherItemFromHashSet(HashSet<ItemForSet> hashSet) {
        ItemForSet anotherItem = new ItemForSet(1000000);
        long start1 = System.nanoTime();
        hashSet.remove(anotherItem);
        long end1 = System.nanoTime();
        return differenceOfTime = end1 - start1;
    }

}
