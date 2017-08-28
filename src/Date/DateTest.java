package Date;

import org.junit.Assert;
import org.junit.Test;

public class DateTest {
    @Test
    public void dateDefaultGetDayGetMonthGetYearTest() {
        Date date = new Date(12, 11, 1998);
        Assert.assertEquals(12, date.getDay());
        Assert.assertEquals(11, date.getMonth());
        Assert.assertEquals(1998, date.getYear());
    }

    @Test
    public void dateDefaultGetDayGetMonthGetYearValidationNotAllowTest() {
        Date date = new Date(59, 14, 1888);
        Assert.assertNotEquals(59, date.getDay());
        Assert.assertNotEquals(14, date.getMonth());
        Assert.assertNotEquals(1888, date.getYear());
    }

    @Test
    public void dateDefaultSetDaySetMonthSetYearTest() {
        Date date = new Date(14, 12, 1995);
        date.setDay(12);
        date.setMonth(11);
        date.setYear(1998);
        Assert.assertEquals(12, date.getDay());
        Assert.assertEquals(11, date.getMonth());
        Assert.assertEquals(1998, date.getYear());
    }

    @Test
    public void dateDefaultSetDateTest() {
        Date date = new Date(14, 12, 1995);
        date.setDate(12, 11, 1998);
        Assert.assertEquals(12, date.getDay());
        Assert.assertEquals(11, date.getMonth());
        Assert.assertEquals(1998, date.getYear());
    }

    @Test
    public void dateDefaultToStringTest() {
        Date date = new Date(14, 12, 1995);
        Assert.assertEquals("14/12/1995", date.toString());
    }

    @Test
    public void dateDefaultToStringTwoTest() {
        Date date = new Date(2, 1, 1995);
        Assert.assertEquals("02/01/1995", date.toString());
    }
}
