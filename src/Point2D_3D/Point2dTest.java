package Point2D_3D;

import org.junit.Assert;
import org.junit.Test;

public class Point2dTest {
    @Test
    public void getXtest() {
        Point2d point2d = new Point2d(2, 5);
        Assert.assertEquals(2, point2d.getX(), 0.1);
    }

    @Test
    public void getYtest() {
        Point2d point2d = new Point2d(2, 5);
        Assert.assertEquals(5, point2d.getY(), 0.1);
    }

    @Test
    public void setXtest() {
        Point2d point2d = new Point2d(2, 5);
        point2d.setX(11);
        Assert.assertEquals(11, point2d.getX(), 0.1);
    }

    @Test
    public void setYtest() {
        Point2d point2d = new Point2d(2, 5);
        point2d.setY(8);
        Assert.assertEquals(8, point2d.getY(), 0.1);
    }

    @Test
    public void setXYtest() {
        Point2d point2d = new Point2d(1, 2);
        Assert.assertEquals(1, point2d.getX(), 0.1);
        Assert.assertEquals(2, point2d.getY(), 0.1);
        Assert.assertArrayEquals(new float[]{1.0f, 2.0f}, point2d.getXY(), 0.1f);
    }

    @Test
    public void toStringTest() {
        Point2d point2d = new Point2d(1, 2);
        Assert.assertEquals("(1.0,2.0)", point2d.toString());
    }
}
