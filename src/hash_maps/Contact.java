package hash_maps;

public class Contact {
    Double product1;
    Double product2;
    Double product3;

    public Contact(Double product1, Double product2, Double product3){
        this.product1 = product1;
        this.product2 = product2;
        this.product3 = product3;
    }

    public String toString() {
        return product1 + " + " + product2 + " + " + product3;
    }


}
