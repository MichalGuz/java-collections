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

    public Item getItem(){
        return item;
    }

    public String getNumberOfAction(){
        return numberOfAction;
    }

    public LocalDate getDateOfAction(){
        return dateOfAction;
    }

    @Override
    public String toString(){
        return "Action initialized " + dateOfAction + ", number of action: " + numberOfAction + "\n<< " + item + " >>";
    }
}
