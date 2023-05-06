package Lesson8;

import org.junit.*;

public class TestClass2 {
    DataClass testData = new DataClass();

    @Test
    public void testEquals(){
        Assert.assertEquals(4, testData.sum(2, 2));
    }

    @Test
    public void testBoolAnd(){
        Assert.assertFalse(testData.boolAnd(false, true));
    }

    @Test
    public void testIsStringEmpty(){
        String str = "Hello world";
        Assert.assertFalse(testData.isStringEmpty(str));
    }

    @Test
    public void testCharAt(){
        String str = "Hello world";
        Assert.assertEquals('e', testData.charAt(str, 1));
    }
}
