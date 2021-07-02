package testswithotherclasses.practice;

import org.junit.Test;

import static org.junit.Assert.*;

public class IntegerExamplesTest {

    @Test
    public void integerExploration() {
        Integer four = 4;
        assertEquals("intValue returns 4", 4, four.intValue());
        Integer five = Integer.valueOf("5");
        assertEquals("intValue returns 5", 5, five.intValue());
    }
    @Test
    public void intToHex() {
        Integer num1 = 11;
        assertEquals("11 becomes b","b", Integer.toHexString(num1));
        Integer num2 = 10;
        assertEquals("10 becomes a", "a", Integer.toHexString(num2));
        Integer num3 = 3;
        assertEquals("3 becomes 3", "3", Integer.toHexString(num3));
        Integer num4 = 21;
        assertEquals("21 becomes 15", "15", Integer.toHexString(num4));
    }
    @Test
    public void integerMinMax() {
        int maxInt = Integer.MAX_VALUE;
        assertEquals("maximum int should be 2147483647",
                2147483647, maxInt);
        int minInt = Integer.MIN_VALUE;
        assertEquals("minimum int should be -2147483648",
                -2147483648, minInt);
    }
    @Test
    public void checkEquality() {
        int four = 4;
        int num = Integer.valueOf("4");
        assertEquals("4 is equal to 4", four, num);
    }
    @Test
    public void checkIdentity() {
        IntegerExamplesTest obj1 = new IntegerExamplesTest();
        IntegerExamplesTest obj2 = new IntegerExamplesTest();
        assertFalse("four should not be identical to num", obj1 == obj2);
    }
}
