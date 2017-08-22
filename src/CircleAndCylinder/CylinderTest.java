package CircleAndCylinder;

import org.junit.Assert;
import org.junit.Test;

public class CylinderTest {
    @Test
    public void getHeightTest() {
        Cylinder cylinder = new Cylinder(1, 2, "red");
        Assert.assertEquals(2.0, cylinder.getHeight(), 0.1);
    }

    @Test
    public void setHeightTest() {
        Cylinder cylinder = new Cylinder(1, 2, "red");
        cylinder.setHeight(15.0);
        Assert.assertEquals(15.0, cylinder.getHeight(), 0.1);
    }

    @Test
    public void getVolumeTest() {
        Cylinder cylinder = new Cylinder(1, 2, "red");
        Assert.assertEquals(6.283185307179586, cylinder.getVolume(), 0.1);
    }
}
