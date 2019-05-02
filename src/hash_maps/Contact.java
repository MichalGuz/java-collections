package hash_maps;

public class Contact {
    String contact1;
    String contact2;
    String contact3;

    public Contact(String contact1, String contact2, String contact3){
        this.contact1 = contact1;
        this.contact2 = contact2;
        this.contact3 = contact3;
    }

   public String toString() {
        return contact1 + " + " + contact2 + " + " + contact3;
    }
}
