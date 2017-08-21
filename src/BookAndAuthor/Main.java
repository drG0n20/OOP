package BookAndAuthor;

public class Main {
    public static void main(String[] args) {
        Author tolkien = new Author("Tolkien", "email", 'm');


        Book book = new Book("LotR", tolkien, 23.99);
        Book book2 = new Book("LotR", new Author("LotR", "email", 'm'), 23.99);
        System.out.println(book);
        System.out.println(book2);
    }
}
