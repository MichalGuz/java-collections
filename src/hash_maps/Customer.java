package hash_maps;

public class Customer {
    String name;
    String adress;
    String regonId;

    public Customer(String name, String adress, String regonId) {
        this.name = name;
        this.adress = adress;
        this.regonId = regonId;
    }

    @Override
    public boolean equals (Object o){
        final Customer c = (Customer) o;
        return this.name.equals(c.name) && this.adress.equals(c.adress) && this.regonId.equals(c.regonId);
    }


}
