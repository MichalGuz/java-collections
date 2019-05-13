package time_of_operation;

import java.util.ArrayList;

public class BigArrayList {

    public void bigArrayListProcessor(){
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i = 0; i < 1000000; i++) {
            numbers.add(i);
        }
    }
}
