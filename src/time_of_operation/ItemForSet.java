package time_of_operation;

public class ItemForSet {
    Integer item;

    ItemForSet(Integer item){
        this.item = item;
    }

    @Override
    public boolean equals(Object o){
        final ItemForSet i = (ItemForSet) o;
        return this.item.equals(i.item);
    }
}
