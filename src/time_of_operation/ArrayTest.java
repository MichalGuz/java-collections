package time_of_operation;

import java.util.ArrayList;

public class ArrayTest {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i = 0; i < 10000; i++) {
            numbers.add(i);
        }

        System.out.println("Size of collection 'numbers': " + numbers.size() + " elements.");

        ArrayList<Integer> moreNumbers = new ArrayList<>();
        for(int k = 0; k < 1000000; k++){
            moreNumbers.add(k);
        }

        System.out.println("Size of collection 'moreNumbers': " + moreNumbers.size() + " elements.");

    }
}
