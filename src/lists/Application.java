package lists;

import java.util.*;

public class Application {
    public static void main(String[] args) {
        Incomes incomes = new Incomes();
        incomes.incomeProcess();

        LastRemoved lastRemoved = new LastRemoved();
        lastRemoved.lastRemovedProcess();

    }
}