package time_of_operation;

public class TimeComparison {
    public static void main(String[] args) {

        BigArrayList list = new BigArrayList();
        list.createCollection();
        list.timeOfAddFirst();
        list.timeOfAddLast();
        list.timeOfRemoveFirst();
        list.timeOfRemoveLast();
        list.print();
    }
}
