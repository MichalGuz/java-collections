package queue_stack_clipboard;

import java.time.LocalDate;

public class CutCopy {
    Item item;
    String numberOfAction;
    LocalDate dateOfAction;

    public CutCopy(Item item, String numberOfAction, int year, int month, int day){
        this.item = item;
        this.numberOfAction = numberOfAction;
        this.dateOfAction = LocalDate.of(year, month, day);
    }
}
