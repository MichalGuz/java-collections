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

        System.out.println("\nCollection numbers contains;");
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

        System.out.println("\nCollection duplicated size is: " + duplicated.size());
        for(MyObject print: duplicated) {
            System.out.println("Duplicate: " + print.getValue());
        }

        ArrayList<MyObject> duplicatedFinal = new ArrayList<>();
        duplicatedFinal.add(duplicated.get(0));
        for(int k = 0; k < duplicated.size(); k++) {
            if (!(duplicatedFinal.contains(duplicated.get(k)))) {
                duplicatedFinal.add(duplicated.get(k));
            }
        }

        System.out.println("\nCollection duplicatedFinal size is: " + duplicatedFinal.size());
        for(MyObject print: duplicatedFinal) {
            System.out.println("Duplicate final: " + print.getValue());
        }
    }
}
