package Rectangle;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectangleTest {
    @Test
    public void rectangleSetLengthAndGetLengthTest() {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(5.0f);
        assertEquals(5.0f, rectangle.getLength(), 0.1);
    }

    @Test
    public void rectangleSetWidthAndGetWidthTest() {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(5.0f);
        assertEquals(5.0f, rectangle.getWidth(), 0.1);
    }

    @Test
    public void rectangleGetAreaTest() {
        Rectangle rectangle = new Rectangle();
        assertEquals(1.0f, rectangle.getArea(), 0.1);
    }

    @Test
    public void rectangleGetPerimeterTest() {
        Rectangle rectangle = new Rectangle();
        assertEquals(4.0f, rectangle.getPerimeter(), 0.1);
    }

    @Test
    public void rectangleToStringTest() {
        Rectangle rectangle = new Rectangle();
        assertEquals("Rectangle[length=1,000000, width=1,000000]", rectangle.toString());
    }
}
