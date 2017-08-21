package BookAndAuthor;

import org.junit.Assert;
import org.junit.Test;

public class AuthorTest {
    @Test
    public void getNameTest() {
        Author author = new Author("Janusz", "email@gmail.com", 'm');
        Assert.assertEquals("Janusz", author.getName());
    }

    @Test
    public void getEmailTest() {
        Author author = new Author("Janusz", "email@gmail.com", 'm');
        Assert.assertEquals("email@gmail.com", author.getEmail());
    }

    @Test
    public void getGenderTest() {
        Author author = new Author("Janusz", "email@gmail.com", 'm');
        Assert.assertEquals(new Character('m'), author.getGender());
    }

    @Test
    public void setEmailTest() {
        Author author = new Author("Janusz", "email@gmail.com", 'm');
        author.setEmail("nowy@mail.com");
        Assert.assertEquals("nowy@mail.com", author.getEmail());
    }

    @Test
    public void toStringTest() {
        Author author = new Author("Janusz", "email@gmail.com", 'm');
        Assert.assertEquals("Author[name=Janusz,email=email@gmail.com,gender=m]", author.toString());
    }

}
