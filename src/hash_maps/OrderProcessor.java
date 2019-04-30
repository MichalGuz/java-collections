package hash_maps;

import java.util.HashMap;

public class OrderProcessor {
    public static void main (String[] args) {
        Customer customer1 = new Customer("Trade Int. sp z o.o.", "Warszawa", "457688821", "31-0114" );
        Customer customer2 = new Customer("Jarex sp z o.o.", "Warszawa", "555848861", "31-0023");
        Customer customer3 = new Customer("Optima Int. sp z o.o.", "Kraków", "175214863", "40-0094" );
        Customer customer4 = new Customer("Kowalski Instalacje", "Szczecin", "834164173", "70-0004" );
        Customer customer5 = new Customer("ZTD Poznań", "Poznań", "794375601", "60-0024" );

        Order order1= new Order(1000.0, 400.0, 0.0);
        Order order2= new Order(0.0, 450.0, 20.0);
        Order order3= new Order(0.0, 0.0, 100.0);
        Order order4= new Order(1500.0, 5000.0, 600.0);

        HashMap<Customer, Order> collection = new HashMap<Customer, Order>();
        collection.put(customer1, order1);
        collection.put(customer2, order2);
        collection.put(customer3, order3);
        collection.put(customer4, order4);


        )


    }
}
