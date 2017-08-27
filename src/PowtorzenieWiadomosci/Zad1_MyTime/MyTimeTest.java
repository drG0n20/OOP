package PowtorzenieWiadomosci.Zad1_MyTime;

import org.junit.Assert;
import org.junit.Test;

public class MyTimeTest {
    @Test
    public void defaultMyTimeSetAndGetHourAndMinuteAndSecond() {
        MyTime myTime = new MyTime();
        myTime.setTime(22, 30, 45);
        Assert.assertEquals(22, myTime.getHour());
        Assert.assertEquals(30, myTime.getMinute());
        Assert.assertEquals(45, myTime.getSecond());
    }
}
