package BookAndAuthor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
    @Test
    public void bookGetNameTest() {
        Author author = new Author("Janusz", "email@gmail.com", 'm');
        Book book = new Book("Tolkien", author, 23.99, 5);
        assertEquals("Tolkien", book.getName());
    }

    @Test
    public void bookGetPriceTest() {
        Author author = new Author("Janusz", "email@gmail.com", 'm');
        Book book = new Book("Tolkien", author, 23.99, 5);
        assertEquals(new Double(23.99), book.getPrice());
    }

    @Test
    public void bookGetAuthorTest() {
        Author author = new Author("Janusz", "email@gmail.com", 'm');
        Book book = new Book("Tolkien", author, 23.99, 5);
        assertEquals(author, book.getAuthor());
    }

    @Test
    public void bookGetQtyTest() {
        Author author = new Author("Janusz", "email@gmail.com", 'm');
        Book book = new Book("Tolkien", author, 23.99, 5);
        assertEquals(new Integer(5), book.getQty());
    }

    @Test
    public void bookSetPriceTest() {
        Author author = new Author("Janusz", "email@gmail.com", 'm');
        Book book = new Book("Tolkien", author, 23.99, 5);
        book.setPrice(6.66);
        assertEquals(new Double(6.66), book.getPrice());
    }

    @Test
    public void bookSetQtyTest() {
        Author author = new Author("Janusz", "email@gmail.com", 'm');
        Book book = new Book("Tolkien", author, 23.99, 5);
        book.setQty(45);
        assertEquals(new Integer(45), book.getQty());
    }

    @Test
    public void bookToStringTest() {
        Author author = new Author("Janusz", "email@gmail.com", 'm');
        Book book = new Book("Tolkien", author, 23.99, 5);
        assertEquals("Book[name=Tolkien," +
                author +
                ", price=23,99, qty=5]", book.toString());
    }
}
