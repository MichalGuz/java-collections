package hashSet_books;

import java.util.HashSet;

public class BookApplication {
    public static void main(String[] args) {
        Book book1 = new Book("Umberto Eco", "Imię Róży", 1990);
        Book book2 = new Book("Italo Calvino", "Wicehrabia przepołowiony", 1992);
        Book book3 = new Book("Jose Luis Borges", "Fikcje", 1988);
        Book book4 = new Book("Witold Gombrowicz", "Kosmos",1970);
        Book book5 = new Book("Szczepan Twardoch", "Morfina", 2012);
        Book book6 = new Book("Michel Houellebecq", "Cząstki elementarne", 2000);

        HashSet<Book> setOfBooks = new HashSet<Book>();
        setOfBooks.add(book1);
        setOfBooks.add(book2);
        setOfBooks.add(book3);
        setOfBooks.add(book4);
        setOfBooks.add(book5);
        setOfBooks.add(book6);

        System.out.println("Old books in the collection (released before 2000):");
        for(Book oldBooks: setOfBooks){
            if (oldBooks.getYearOfRelease() < 2000) {
                System.out.println(oldBooks);
            }
        }
    }
}
