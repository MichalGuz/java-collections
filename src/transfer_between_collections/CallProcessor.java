package transfer_between_collections;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class CallProcessor {
    ArrayList<String> madeCalls;

    // constructor
    public CallProcessor(){
        madeCalls = new ArrayList<String>();
    }

    public void makeCalls(ArrayDeque<String> theQueue) {
        while (theQueue.size()>0){
            String call = theQueue.poll();
            System.out.println("Making a call: " + call);
            madeCalls.add(call);
        }
    }

}
