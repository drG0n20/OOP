package Koszyk;

import org.junit.Assert;
import org.junit.Test;

public class ZdrajcaMetaluTest {
    @Test
    public void setAndGetPriceTest() {
        ZdrajcaMetalu zm = new ZdrajcaMetalu();
        zm.setPrice(34);
        Assert.assertEquals(34, zm.getPrice());
    }

    @Test
    public void setAndGetProductNameTest() {
        ZdrajcaMetalu zm = new ZdrajcaMetalu();
        zm.setProductName("Plyta CD");
        Assert.assertEquals("Plyta CD", zm.getProductName());
    }

    @Test
    public void setAndGetTitleTest() {
        ZdrajcaMetalu zm = new ZdrajcaMetalu();
        zm.setTitle("666");
        Assert.assertEquals("666", zm.getTitle());
    }

    @Test
    public void setAndGetPerformerTest() {
        ZdrajcaMetalu zm = new ZdrajcaMetalu();
        zm.setPerformer("Nocny Kochanek");
        Assert.assertEquals("Nocny Kochanek", zm.getPerformer());
    }


}
