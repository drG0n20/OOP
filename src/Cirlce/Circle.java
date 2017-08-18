package Cirlce;

public class Circle {
    private double _radius = 1.0;
    private String _color = "red";

    public Circle() {
    }

    public Circle(double r) {
        _radius = r;
    }

    public Circle(double r, String color) {
        _radius = r;
        _color = color;
    }

    public double getRadius() {
        return _radius;
    }

    public double setRadius(double radius) {
        return _radius = radius;
    }

    public String getColor() {
        return _color;
    }

    public void setColor(String color) {
        _color = color;
    }

    public double getArea() {
        return Math.PI * Math.pow(_radius, 2d);
    }

    public String toString() {
        return "Circle[radius=" + _radius + ",color=" + _color + "]";
    }
}
