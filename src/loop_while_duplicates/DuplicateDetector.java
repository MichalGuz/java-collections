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
                            duplicated.add(checkedObject);
                    }
                }
            }
        }

        for(MyObject print: duplicated) {
            System.out.println("Duplicate:" + print.getValue());
        }

        Iterator<MyObject> iterator1 = duplicated.iterator();
        ArrayList<MyObject> duplicatedFinal = new ArrayList<>();
        while (iterator1.hasNext()) {
            MyObject testedObject = iterator1.next();
            for(int k = 0; k < duplicated.size(); k++) {
                if (duplicated.get(k).hashCode() != testedObject.hashCode()) {
                    while (duplicated.get(k).getValue() != testedObject.getValue()) {
                        System.out.println("first element = " + duplicated.get(k).getValue());
                        System.out.println("second element = " + testedObject.getValue());
                        duplicatedFinal.add(testedObject);
                    }
                }
            }
        }

        System.out.println("Collection duplicatedFinal size is: " + duplicatedFinal.size());
        for(MyObject print: duplicatedFinal) {
            System.out.println("Duplicate final:" + print.getValue());
        }
    }
}
