package time_of_operation;

public interface CollectionProcessor {
   // void createCollection();

    long timeOfAddFirst();

    long timeOfAddLast();

    long timeOfRemoveFirst();

    long timeOfRemoveLast();

    void print();

}