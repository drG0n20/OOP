package ShapeAndCircleAndRectangle;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape("yello", true);
        Circle circle = new Circle(2.5, "green", true);
        Rectangle rectangle = new Rectangle(2.0, 3.0, "green", false);
        Square square = new Square(2.0);
        System.out.println(shape);
        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(square);
    }
}

