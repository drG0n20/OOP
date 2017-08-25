package Date;

import org.junit.Assert;
import org.junit.Test;

public class DateTest {
    @Test
    public void toStringTest() {
        Date date = new Date(12, 5, 2013);
        Assert.assertEquals("12/05/2013", date.toString());
    }
}
