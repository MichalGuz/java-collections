package time_of_operation;

import java.util.HashSet;

public class HashSetCreator {
    public void arrayListCreate() {

        HashSetProcessor hashSetProcessor = new HashSetProcessor();
        HashSetPrintTime hashSetPrintTime = new HashSetPrintTime();

        HashSet<ItemForSet> items = new HashSet<>();
        for (int i = 0; i < 10000; i++) {
            items.add(new ItemForSet(i));
        }

        hashSetProcessor.timeOfAddOneItemToHashSet(items);
        hashSetProcessor.timeOfAddAnotherItemToHashSet(items);
        hashSetProcessor.timeOfRemoveOneItemFromHashSet(items);
        hashSetProcessor.timeOfRemoveAnotherItemFromHashSet(items);
        hashSetProcessor.timeOfCheckIfHashSetContains(items);

        hashSetPrintTime.printHashSetTime(hashSetProcessor, items);

        HashSet<ItemForSet> big = new HashSet<>();
        for (int i = 0; i < 1000000; i++) {
            big.add(new ItemForSet(i));
        }

        hashSetProcessor.timeOfAddOneItemToHashSet(big);
        hashSetProcessor.timeOfAddAnotherItemToHashSet(big);
        hashSetProcessor.timeOfRemoveOneItemFromHashSet(big);
        hashSetProcessor.timeOfRemoveAnotherItemFromHashSet(big);
        hashSetProcessor.timeOfCheckIfHashSetContains(big);

        hashSetPrintTime.printHashSetTime(hashSetProcessor, big);
    }
}
