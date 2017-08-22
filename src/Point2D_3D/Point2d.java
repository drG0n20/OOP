package Point2D_3D;

public class Point2d {
    private float _x = 0.0f;
    private float _y = 0.0f;

    public Point2d(float x, float y) {
        _x = x;
        _y = y;
    }

    public Point2d() {
    }

    public float getX() {
        return _x;
    }

    public void setX(float x) {
        _x = x;
    }

    public float getY() {
        return _y;
    }

    public void setY(float y) {
        _y = y;
    }

    public void setXY(float x, float y) {
        _x = x;
        _y = y;
    }

    public float[] getXY() {
        return new float[]{_x, _y};
    }

    public String toString() {
        return String.format("(%s,%s)", _x, _y);
    }
}
