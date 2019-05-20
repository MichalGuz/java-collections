package time_of_operation;

import java.util.HashMap;

public class HashMapNumberProcessor {

    long differenceOfTime;

    public long timeOfAddOneItemToHashMapNumber(HashMap<Number, String> hashMap){
        long start1 = System.nanoTime();
        hashMap.put(new Number(0, 0), "text");
        long end1 = System.nanoTime();
        return differenceOfTime = end1 - start1;
    }

    public long timeOfAddAnotherItemToHashMapNumber(HashMap<Number, String> hashMap){
        long start1 = System.nanoTime();
        hashMap.put(new Number(10000000, 1000000),"text1000000");
        long end1 = System.nanoTime();
        return differenceOfTime = end1 - start1;
    }

    public long timeOfRemoveOneItemFromHashMapNumber(HashMap<Number,String> hashMap){
        long start3 = System.nanoTime();
        hashMap.remove(0);
        long end3 = System.nanoTime();
        return differenceOfTime = end3 - start3;
    }

    public long timeOfRemoveAnotherItemFromHashMapNumber(HashMap<Number,String> hashMap){
        long start4 = System.nanoTime();
        hashMap.remove((hashMap.size() - 1));
        long end4 = System.nanoTime();
        return differenceOfTime = end4 - start4;
    }

    public long timeOfGetAnotherItemFromHashMapNumber(HashMap<Number, String> hashMap){
        long start5 = System.nanoTime();
        hashMap.get((hashMap.size()/2));
        long end5 = System.nanoTime();
        return differenceOfTime = end5 - start5;
    }

}
