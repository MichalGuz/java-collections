package loop_while_duplicates;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

public class DuplicateDetector {
    public static void main(String[] args) {
        LinkedList<MyObject> numbers = new LinkedList<MyObject>();
        Random randomGenerator = new Random();
        for (int i = 0; i < 10; i++) {
            numbers.add(new MyObject(randomGenerator.nextInt(10)));
        }
        for(MyObject print: numbers) {
            System.out.println(print.getValue());
        }

        Iterator<MyObject> iterator = numbers.iterator();
        ArrayList<MyObject> duplicated = new ArrayList<>();
        while (iterator.hasNext()) {
            MyObject checkedObject = iterator.next();
            for (int p = 0; p < numbers.size(); p++) {
                if (numbers.get(p).hashCode() != checkedObject.hashCode()) {
                    if (numbers.get(p).equals(checkedObject)){
//                        if(duplicated.isEmpty()) {
                            duplicated.add(checkedObject);
//                        } else {
//                            for(MyObject temp: duplicated){
//                                System.out.println("Temp: " + temp.getValue());
//                                System.out.println("Check: " + checkedObject.getValue());
//                                if(temp.getValue() != checkedObject.getValue()) {
//                                    duplicated.add(checkedObject);
//                                    System.out.println("Are not equal");
//                                }
//                            }
//                        }

                    }
                }
            }
        }

        for(MyObject print: duplicated) {
            System.out.println("Duplicate:" + print.getValue());
        }
    }
}
