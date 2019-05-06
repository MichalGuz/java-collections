package queue_stack_clipboard;

public class Item {
    String item;
    String numberOfItem;

    public Item(String item, String numberOfItem){
        this.item = item;
        this.numberOfItem = numberOfItem;
    }

    public String getItem(){
        return item;
    }

    public String getNumberOfItem(){
        return numberOfItem;
    }

    @Override
    public String toString(){
        return item + "[" + numberOfItem + "];";
    }
}
