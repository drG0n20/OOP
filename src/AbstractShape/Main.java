package AbstractShape;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(2.5, "green", true);
        System.out.println(circle);
        Rectangle rectangle = new Rectangle(2.0, 3.0, "green", false);
        System.out.println(rectangle);
        Square square = new Square(2.0);
        System.out.println(square);
    }
}

