package Lesson8;

import org.junit.Assert;
import org.junit.Test;

public class TestClass {

    @Test
    public void testEquals(){
//        Assert.assertEquals(4, operations.sum(3, 2));
        Assert.assertTrue(4 == 2+2);
    }

    @Test
    public void testNotEquals(){
        Assert.assertFalse(5== 2+2);
    }
}
