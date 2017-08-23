package Point2D_3D;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Point3dTest {
    @Test
    public void getZtest() {
        Point3d point3d = new Point3d(1, 2, 3);
        assertEquals(3f, point3d.getZ(), 0.1f);
    }

    @Test
    public void setZtest() {
        Point3d point3d = new Point3d(1, 2, 3);
        point3d.setZ(5f);
        assertEquals(5f, point3d.getZ(), 0.1f);
    }

    @Test
    public void setXYZandGetXYZtest() {
        Point3d point3d = new Point3d(1, 2, 3);
        point3d.setXYZ(5, 2, 3);
        assertArrayEquals(new float[]{5.0f, 2.0f, 3.0f}, point3d.getXYZ(), 0.1f);
    }

    @Test
    public void toStringTest() {
        Point3d point3d = new Point3d(1, 2, 3);
        assertEquals("(1.0, 2.0, 3.0)", point3d.toString());
    }

}
