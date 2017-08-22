package MyPointAndMyCircle;

import org.junit.Assert;
import org.junit.Test;

public class MyPointTest {
    @Test
    public void getXTest() {
        MyPoint newPoint = new MyPoint(2, 3);
        Assert.assertEquals(2, newPoint.getX());
    }

    @Test
    public void getYTest() {
        MyPoint newPoint = new MyPoint(2, 3);
        Assert.assertEquals(3, newPoint.getY());
    }

    @Test
    public void setXTest() {
        MyPoint newPoint = new MyPoint(2, 3);
        newPoint.setX(5);
        Assert.assertEquals(5, newPoint.getX());
    }

    @Test
    public void setYTest() {
        MyPoint newPoint = new MyPoint(2, 3);
        newPoint.setY(7);
        Assert.assertEquals(7, newPoint.getY());
    }
//
//    @Test
//    public void getXYTest() {
//        MyPoint newPoint = new MyPoint(2, 3);
//        Assert.assertEquals(, newPoint.getXY());
//    }
//
//    @Test
//    public void setXYTest() {
//        MyPoint newPoint = new MyPoint(2, 3);
//        newPoint.setXY(7,6);
//        Assert.assertEquals(, newPoint.getXY());
//    }

    @Test
    public void toStringTest() {
        MyPoint newPoint = new MyPoint(2, 3);
        Assert.assertEquals("(2,3)", newPoint.toString());
    }


}
