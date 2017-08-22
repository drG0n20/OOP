package Cirlce;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CircleTest {

    @Test
    public void circleAreaTest() {
        Circle circle = new Circle();
        assertEquals(3.14d, circle.getArea(), 0.01);
    }

    @Test
    public void circleDefaultRadiusTest() {
        Circle circle = new Circle();
        assertEquals("red", circle.getColor());
    }

    @Test
    public void circleDefaultColorTest() {
        Circle circle = new Circle();
        assertEquals(1.0, circle.getRadius(), 0.1);
    }

    @Test
    public void circleAreaRadius2Test() {
        Circle circle = new Circle(2.0);
        assertEquals(12.56d, circle.getArea(), 0.01);
    }

    @Test
    public void circleDefaultRadius2Test() {
        Circle circle = new Circle(2.0);
        assertEquals(2.0, circle.getRadius(), 0.1);
    }

    @Test
    public void circleRadius2StringTest() {
        Circle circle = new Circle(2.0);
        assertEquals("Circle[radius=2.0,color=red]", circle.toString());
    }

    @Test
    public void circleSetRadiusTest() {
        Circle circle = new Circle();
        circle.setRadius(2.0);
        assertEquals(2.0, circle.getRadius(), 0.1);
    }

    @Test
    public void circleSetColorTest() {
        Circle circle = new Circle();
        circle.setColor("red");
        assertEquals("red", circle.getColor());
    }
}
