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

    public long timeOfAddAnotherItemToHashSet(HashSet<ItemForSet> hashSet){
        long start1 = System.nanoTime();
        hashSet.add(new ItemForSet(1000001));
        long end1 = System.nanoTime();
        return differenceOfTime = end1 - start1;
}
