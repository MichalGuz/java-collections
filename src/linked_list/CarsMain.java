package linked_list;
import java.util.LinkedList;
import java.util.List;

public class CarsMain {
    public static void main (String[] args) throws java.lang.Exception
    {
        List<Cars> theCars = new LinkedList<>();
        for(int n=0; n<30; n++) {
            theCars.add(new Cars("Brand " + n, 1990 + (n % 10)));
            System.out.println(theCars.get(n));
        }
        System.out.println("The size of list = " + theCars.size());
        Cars car = new Cars("Brand 20", 1990 + (20 % 10));
        theCars.add(car);
        System.out.println("The size of list = " + theCars.size());
        theCars.remove(car);
        System.out.println("The size of list = " + theCars.size());
        theCars.remove(car);
        System.out.println("The size of list = " + theCars.size());

        for(Cars carOne : theCars) {
            if (carOne.getYearOfProduction() == 1995) {
                System.out.println(carOne);
            }
        }
    }
}
