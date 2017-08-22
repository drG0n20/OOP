package MyPointAndMyCircle;

import org.junit.Assert;
import org.junit.Test;

public class MyCircleTest {
    @Test
    public void setRadiusAndgetRadiusTest() {
        MyCircle circle = new MyCircle(0, 0, 3);
        circle.setRadius(23);
        Assert.assertEquals(23, circle.getRadius());
    }

//    @Test
//    public void setCenterAndgetCenterTest() {
//        MyCircle circle = new MyCircle(0, 0, 3);
//        MyPoint myPoint = new MyPoint(1,1);
//        Assert.assertArrayEquals(, circle.getCenter());
//    }
}
