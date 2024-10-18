public class Book {
    private String name;
    private Author author;
    private int publicationYear;

    public Book(String name, Author author, int year) {
        this.name = name;
        this.author = author;
        this.publicationYear = year;
    }

    public String getName() {
        return this.name;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getYear() {
        return this.publicationYear;
    }

    public void setYear(int year) {
        this.publicationYear = year;
    }
}
