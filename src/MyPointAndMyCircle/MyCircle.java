package MyPointAndMyCircle;

public class MyCircle {
    private MyPoint _center = new MyPoint(0, 0);
    private int _radius = 1;

    public MyCircle() {
    }

    public MyCircle(int x, int y, int radius) {
        _center = new MyPoint(x, y);
        _radius = radius;
    }

    public MyCircle(MyPoint center, int radius) {
        _center = center;
        _radius = radius;
    }

    public int getRadius() {
        return _radius;
    }

    public void setRadius(int radius) {
        _radius = radius;
    }

    public MyPoint getCenter() {
        return _center;
    }

    public void setCenter(MyPoint center) {
        _center = center;
    }

    public int getCenterX() {
        return _center.getX();
    }

    public void setCenterX(int x) {
        _center.setX(x);
    }

    public int getCenterY() {
        return _center.getY();
    }

    public void setCenterY(int y) {
        _center.setY(y);
    }

    public int[] getCenterXY() {
        return _center.getXY();
    }

    public void setCenterXY(int x, int y) {
        _center.setXY(x, y);
    }

    public String toString() {
        return String.format("MyCircle[radius=%s, center=%s]", _radius, _center.toString());
    }

    public double getArea() {
        return Math.PI * Math.pow(_radius, 2);
    }

    public double getCircumference() {
        return 2 * Math.PI * _radius;
    }

    public double distance(MyCircle another) {
        return _center.distance(another.getCenter());
    }
}
