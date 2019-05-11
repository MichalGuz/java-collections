package loop_while_duplicates;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

public class DuplicateDetector {
    public static void main(String[] args) {
        LinkedList<MyObject> numbers = new LinkedList<MyObject>();
        Random randomGenerator = new Random();
        for(int i = 0; i < 100; i++){
            numbers.add(new MyObject(randomGenerator.nextInt(100)));
        }

        Iterator<MyObject> iterator = numbers.iterator();
        while(iterator.hasNext()){
            MyObject checkedObject = iterator.next();
            for(int p=0; p < numbers.size(); p++){

            }
        }
    }
}
