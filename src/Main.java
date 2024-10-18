
public class Main {
    public static void main(String[] args) throws Exception {
        Author author1 = new Author("name1", "surname");
        Author author2 = new Author("name2", "surname1");

        Book book1 = new Book("book1", author2, 1348);
        Book book2 = new Book("book2", author1, 2000);

        book2.setYear(1582);
    }
}
