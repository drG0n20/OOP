package BookAndAuthor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AuthorTest {
    @Test
    public void getNameTest() {
        Author author = new Author("Janusz", "email@gmail.com", 'm');
        assertEquals("Janusz", author.getName());
    }

    @Test
    public void getEmailTest() {
        Author author = new Author("Janusz", "email@gmail.com", 'm');
        assertEquals("email@gmail.com", author.getEmail());
    }

    @Test
    public void getGenderTest() {
        Author author = new Author("Janusz", "email@gmail.com", 'm');
        assertEquals(new Character('m'), author.getGender());
    }

    @Test
    public void setEmailTest() {
        Author author = new Author("Janusz", "email@gmail.com", 'm');
        author.setEmail("nowy@mail.com");
        assertEquals("nowy@mail.com", author.getEmail());
    }

    @Test
    public void toStringTest() {
        Author author = new Author("Janusz", "email@gmail.com", 'm');
        assertEquals("Author[name=Janusz,email=email@gmail.com,gender=m]", author.toString());
    }
}
