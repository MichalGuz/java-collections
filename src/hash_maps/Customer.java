package hash_maps;

public class Customer {
    String name;
    String adress;
    String regonId;
    String customerId;

    public Customer(String name, String adress, String regonId, String customerId) {
        this.name = name;
        this.adress = adress;
        this.regonId = regonId;
        this.customerId = customerId
    }

    @Override
    public boolean equals (Object o){
        final Customer c = (Customer) o;
        return this.name.equals(c.name) && this.adress.equals(c.adress) && this.regonId.equals(c.regonId) && this.customerId.equals(c.customerId);
    }

    public int hashCode(){
        return Integer.parseInt(customerId.substring(0,3));
    }

    public String toString() {
        return name + " " + adress + " " + regonId;
    }
}
