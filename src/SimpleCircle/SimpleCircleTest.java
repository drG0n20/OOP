package SimpleCircle;

import org.junit.Assert;
import org.junit.Test;

public class SimpleCircleTest {
    @Test
    public void circleSetRadiusAndGetRadiusTest() {
        SimpleCircle simpleCircle = new SimpleCircle();
        simpleCircle.setRadius(3.0);
        Assert.assertEquals(3.0, simpleCircle.getRadius(), 0.1);
    }

    @Test
    public void circleGetAreaTest() {
        SimpleCircle simpleCircle = new SimpleCircle();
        Assert.assertEquals(3.14d, simpleCircle.getArea(), 0.01);
    }

    @Test
    public void circleGetCircumferenceTest() {
        SimpleCircle simpleCircle = new SimpleCircle();
        Assert.assertEquals(6.28d, simpleCircle.getCircumference(), 0.01);
    }

    @Test
    public void circleToStringTest() {
        SimpleCircle simpleCircle = new SimpleCircle();
        Assert.assertEquals("Circle[radius=?]", simpleCircle.toString());
    }
}
