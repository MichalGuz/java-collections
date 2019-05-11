package loop_while_duplicates;

public class MyObject {
    int value = 0;

    public MyObject(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }

    @Override
    public boolean equals(Object o) {
        MyObject m = (MyObject) o;
        if (m.getValue() == value) {
            return true;
        } else {
            return false;
        }
    }

}
