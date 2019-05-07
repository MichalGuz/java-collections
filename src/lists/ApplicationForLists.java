package lists;

public class ApplicationForLists {
    public static void main(String[] args) {
        Incomes incomes = new Incomes();
        incomes.incomeProcess();

        LastRemoved lastRemoved = new LastRemoved();
        lastRemoved.lastRemovedProcess();

        BigList bigList = new BigList();
        bigList.bigListCreator();
    }
}