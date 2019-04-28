package lists;

import java.util.*;

public class Incomes {

    public void incomeProcess() {
        ArrayList<Integer> incomes = new ArrayList<>();
        incomes.add(2000);
        incomes.add(1500);
        incomes.add(15000);
        incomes.add(3500);
        incomes.add(1500);
        incomes.add(1500);
        incomes.add(1500);
        incomes.add(1500);
        incomes.add(2500);
        incomes.add(1900);
        incomes.add(1500);
        incomes.add(15);

        Integer max = 0;
        Integer min = 150000;
        Integer totalIncomes = 0;
        for (int i = 0; i < incomes.size(); i++) {
            if (incomes.get(i) > max) {
                max = incomes.get(i);
            }
            if (incomes.get(i) < min) {
                min = incomes.get(i);
            }
            totalIncomes += incomes.get(i);
        }
        double average = (totalIncomes - max - min) / (incomes.size() - 2);
        System.out.println("The table_average of incomes = " + average);
    }
}
