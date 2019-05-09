package transfer_between_collections;

import java.util.ArrayDeque;

public class QueueOfCalls {
    public static void main(String[] args) {
        ArrayDeque<String> callQueue = new ArrayDeque<String>();
        for (int i=0; i < 5; i++){
            callQueue.offer("The first call number " + (i + 1));
        }

        ArrayDeque<String> secondCallQueue = new ArrayDeque<String>();

    }
}
