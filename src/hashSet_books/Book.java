package hashSet_books;

public class Book {
    public String author;
    public String title;
    public int yearOfRelease;

    public Book(String author, String title, int yearOfRelease) {
        this.author = author;
        this.title = title;
        this.yearOfRelease = yearOfRelease;
    }

    @Override
    public int hashCode() {
        return yearOfRelease;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    @Override
    public boolean equals(Object o) {
        Book b = (Book) o;
        return author.equals(b.getAuthor()) && title.equals(b.getTitle()) && (yearOfRelease == (b.getYearOfRelease()));
    }

    @Override
    public String toString(){
        return author + " \""+ title + "\" [" + yearOfRelease + "]";
    }

}