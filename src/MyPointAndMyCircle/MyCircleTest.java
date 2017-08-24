package MyPointAndMyCircle;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyCircleTest {
    @Test
    public void setRadiusAndgetRadiusTest() {
        MyCircle circle = new MyCircle(0, 0, 3);
        circle.setRadius(23);
        assertEquals(23, circle.getRadius());
    }

    @Test
    public void setCenterAndgetCenterTest() {
        MyCircle circle = new MyCircle(0, 0, 3);
        assertEquals(0, circle.getCenter().getX());
        assertEquals(0, circle.getCenter().getX());
    }
}
