package lists;

import java.util.ArrayList;
import java.util.Random;

public class BigList {
    public void bigListCreator(){
        ArrayList<Integer> bigList = new ArrayList<>();
        Random random = new Random();
        for(int i=0; i<1500000; i++){
            bigList.add(random.nextInt(10000));
        }
        System.out.println("The list contains " + bigList.size() + " objects.");
    }
}
