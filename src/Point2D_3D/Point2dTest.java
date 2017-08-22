package Point2D_3D;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Point2dTest {
    @Test
    public void setXandYandGetXandYtest() {
        Point2d point2d = new Point2d(2, 5);
        point2d.setX(11);
        point2d.setY(8);
        assertEquals(11, point2d.getX(), 0.1);
        assertEquals(8, point2d.getY(), 0.1);
    }

    @Test
    public void setXYandGetXYtest() {
        Point2d point2d = new Point2d(1, 2);
        assertEquals(1, point2d.getX(), 0.1);
        assertEquals(2, point2d.getY(), 0.1);
        assertArrayEquals(new float[]{1.0f, 2.0f}, point2d.getXY(), 0.1f);
    }

    @Test
    public void toStringTest() {
        Point2d point2d = new Point2d(1, 2);
        assertEquals("(1.0,2.0)", point2d.toString());
    }
}
