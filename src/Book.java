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

    public String toString() {
        return "name " + this.name + ", author " + this.author + ", publication year " + this.publicationYear;
    }

    public boolean equals(Book other) {
        return this.name.equals(other.name) && this.author.equals(other.author) && this.publicationYear == other.publicationYear;
    }

    public int hashCode() {
        return 31 * (name.hashCode() + author.hashCode()) + publicationYear;
    }
}
