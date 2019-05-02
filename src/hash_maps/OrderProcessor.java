package hash_maps;

import java.util.HashMap;
import java.util.Map;

public class OrderProcessor {
    public static void main (String[] args) {
        Customer customer1 = new Customer("Trade Int. sp z o.o.", "Warszawa", "457688821", "31-0114" );
        Customer customer2 = new Customer("Jarex sp z o.o.", "Warszawa", "555848861", "31-0023");
        Customer customer3 = new Customer("Optima Int. sp z o.o.", "Kraków", "175214863", "40-0094" );
        Customer customer4 = new Customer("Kowalski Instalacje", "Szczecin", "834164173", "70-0004" );
        Customer customer5 = new Customer("ZTD Poznań", "Poznań", "794375601", "60-0024" );

        Contact contact1 = new Contact("224599023", "606400345", "-");
        Contact contact2 = new Contact("223442332", "509433782", "502305457");
        Contact contact3 = new Contact("121579672", "676544312", "676544309");
        Contact contact4 = new Contact( "670532431", "670532430", "-");
        Contact contact5 = new Contact( "512614514", "-", "-");

        HashMap<Customer, Contact> collection = new HashMap<Customer, Contact>();
        collection.put(customer1, contact1);
        collection.put(customer2, contact2);
        collection.put(customer3, contact3);
        collection.put(customer4, contact4);
        collection.put(customer5, contact5);

        for(Map.Entry<Customer, Contact> entry: collection.entrySet()) {
            System.out.println("Customer " + entry.getKey() + " contact numbers:");
        }


    }
}
