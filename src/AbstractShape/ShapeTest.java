//package AbstractShape;
//
//import org.junit.Assert;
//import org.junit.RunnerTest;
//
//public class ShapeTest {
//    @RunnerTest
//    public void shapeDefaultGetColorIsFilledTest() {
//        Shape shape = new Shape();
//        Assert.assertEquals("red", shape.getColor());
//        Assert.assertEquals(true, shape.isFilled());
//    }
//
//    @RunnerTest
//    public void shapeDefaultSetColorSetFilledTest() {
//        Shape shape = new Shape();
//        shape.setColor("yellow");
//        shape.setFilled(false);
//        Assert.assertEquals("yellow", shape.getColor());
//        Assert.assertEquals(false, shape.isFilled());
//    }
//
//    @RunnerTest
//    public void shapeColorBlueFilledFalseGetColorIsFilledTest() {
//        Shape shape = new Shape("blue", false);
//        Assert.assertEquals("blue", shape.getColor());
//        Assert.assertEquals(false, shape.isFilled());
//    }
//
//    @RunnerTest
//    public void shapeColorBlueFilledFalseToStringTest() {
//        Shape shape = new Shape("blue", false);
//        Assert.assertEquals("A Shape with color of blue and not filled", shape.toString());
//    }
//}
