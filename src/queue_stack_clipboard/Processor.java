package queue_stack_clipboard;

import java.util.ArrayDeque;

public class Processor {
    public static void main(String[] args) {
        Item item0 = new Item("first text to copy", "0");
        Item item1 = new Item("second text to copy", "1");
        Item item2 = new Item("third text to copy", "2");
        Item item3 = new Item("fourth text to copy", "3");
        Item item4 = new Item("fifth text to copy", "4");

        CutCopy action0 = new CutCopy(item0, "0", 2019,5,4);
        CutCopy action1 = new CutCopy(item1, "1", 2019, 5,5);
        CutCopy action2 = new CutCopy(item2, "2", 2019, 5, 5);
        CutCopy action3 = new CutCopy(item3, "3", 2019, 5, 5);
        CutCopy action4 = new CutCopy(item4, "4", 2019, 5, 5);

        ArrayDeque<CutCopy> cutCopy = new ArrayDeque<CutCopy>();
        cutCopy.push(action0);
        System.out.println("Stack is created. It's size is: " + cutCopy.size());

        cutCopy.push(action1);
        cutCopy.push(action2);
        cutCopy.push(action3);
        cutCopy.push(action4);
        System.out.println("Stack is filled. It's size is: " + cutCopy.size());
    }
}
