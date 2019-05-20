package time_of_operation;

import java.util.HashMap;
import java.util.Random;

public class HashMapProcessor {

    long differenceOfTime;

    public long timeOfAddOneItemToHashMap(HashMap<Integer, String> hashMap){
        long start1 = System.nanoTime();
        hashMap.put(0, "text");
        long end1 = System.nanoTime();
        return differenceOfTime = end1 - start1;
    }
}
