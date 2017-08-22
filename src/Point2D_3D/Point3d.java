package Point2D_3D;

public class Point3d extends Point2d {
    private float _z = 0.0f;

    public Point3d(float x, float y, float z) {
        super(x, y);
        _z = z;
    }

    public Point3d() {
        super();
    }

    public float getZ() {
        return _z;
    }

    public void setZ(float z) {
        _z = z;
    }

    public void setXYZ(float x, float y, float z) {
        setXY(x, y);
        setZ(z);
    }

    public float[] getXYZ() {
        return new float[]{getX(), getY(), _z};
    }

    public String toString() {
        return String.format("(%s, %s, %s)", getX(), getY(), _z);
    }
}
