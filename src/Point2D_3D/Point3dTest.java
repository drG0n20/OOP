package Point2D_3D;

import org.junit.Assert;
import org.junit.Test;

public class Point3dTest {
    @Test
    public void getZtest() {
        Point3d point3d = new Point3d(1, 2, 3);
        Assert.assertEquals(3f, point3d.getZ(), 0.1f);
    }

    @Test
    public void setZtest() {
        Point3d point3d = new Point3d(1, 2, 3);
        point3d.setZ(5f);
        Assert.assertEquals(5f, point3d.getZ(), 0.1f);
    }

    @Test
    public void setXYZtest() {
        Point3d point3d = new Point3d(1, 2, 3);
        Point2d point2d = new Point2d(1, 2);
        Assert.assertEquals(1, point2d.getX(), 0.1);
        Assert.assertEquals(2, point2d.getY(), 0.1);
        Assert.assertEquals(3, point3d.getZ(), 0.1);
        Assert.assertArrayEquals(new float[]{1.0f, 2.0f, 3.0f}, point3d.getXYZ(), 0.1f);
    }
}
