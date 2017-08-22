package MyPointAndMyCircle;

public class MyPoint {
    private int _x = 0;
    private int _y = 0;

    public MyPoint() {
    }

    public MyPoint(int x, int y) {
        _x = x;
        _y = y;
    }

    public int getX() {
        return _x;
    }

    public void setX(int x) {
        _x = x;
    }

    public int getY() {
        return _y;
    }

    public void setY(int y) {
        _y = y;
    }

    public int[] getXY() {
        return new int[]{_x, _y};
    }

    public void setXY(int x, int y) {
        _x = x;
        _y = y;
    }

    public String toString() {
        return String.format("(%d,%d)", _x, _y);
    }

    private double calculateDistance(int x, int y) {
        double pX = Math.pow(x - this._x, 2.0);
        double pY = Math.pow(y - this._y, 2.0);
        return Math.sqrt(pX + pY);
    }

    public Double distance(int x, int y) {
        return calculateDistance(0, 0);
    }

    public Double distance(MyPoint another) {
        return calculateDistance(another._x, another._y);
    }

    public Double distance() {
        return calculateDistance(0, 0);
    }
}
