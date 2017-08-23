package MyPointAndMyCircle;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class MyPointTest {

    @Test
    public void setXandYandGetXandYTest() {
        MyPoint newPoint = new MyPoint(2, 3);
        newPoint.setX(5);
        newPoint.setY(7);
        assertEquals(5, newPoint.getX());
        assertEquals(7, newPoint.getY());
    }

    @Test
    public void setXYandGetXYtest() {
        MyPoint newPoint = new MyPoint(2, 3);
        newPoint.setXY(7, 6);
        assertArrayEquals(new int[]{7, 6}, newPoint.getXY());
    }

    @Test
    public void toStringTest() {
        MyPoint newPoint = new MyPoint(2, 3);
        assertEquals("(2,3)", newPoint.toString());
    }


}
