package time_of_operation;

public class TimeComparison {
    public static void main(String[] args) {

        ArrayListCreator arrayListCreator = new ArrayListCreator();
        arrayListCreator.arrayListCreate();

        LinkedListCreator linkedListCreator = new LinkedListCreator();
        linkedListCreator.linkedListCreate();

        HashMapCreator hashMapCreator = new HashMapCreator();
        hashMapCreator.hashMapCreate();

        HashMapNumberCreator hashMapNumberCreator = new HashMapNumberCreator();
        hashMapNumberCreator.hashMapWithNewBusketsCreate();

        HashSetCreator hashSetCreator = new HashSetCreator();
        hashMapCreator.hashMapCreate();
    }
}
