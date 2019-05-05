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
}