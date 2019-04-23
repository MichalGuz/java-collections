package wrapper;

public class SimpleWrapper {
    public static void main(String[] args ) {
        //check if the values of primitive types and Wrappers are equal for different variables
        int a = 2;
        double b = 1.5;
        char c = 'x';
        int d = 4;

        Integer i = 2;
        Double j = 1.5;
        Character k = 'x';
        Character l = 'y';

        if (a == i) {
            System.out.println("Warpper OK!");
        } else {
            System.out.println("Wrapper error. Values are not equal");
        }

        if (b == j) {
            System.out.println("Warpper OK!");
        } else {
            System.out.println("Wrapper error. Values are not equal");
        }

        if (c == k) {
            System.out.println("Warpper OK!");
        } else {
            System.out.println("Wrapper error. Values are not equal");
        }

        if (a == c) {
            System.out.println("Warpper OK!");
        } else {
            System.out.println("Wrapper error. Values are not equal");
        }

        if (a == d) {
            System.out.println("Warpper OK!");
        } else {
            System.out.println("Wrapper error. Values are not equal");
        }

        if (c == l) {
            System.out.println("Warpper OK!");
        } else {
            System.out.println("Wrapper error. Valuse are not equal");
        }
    }
}
