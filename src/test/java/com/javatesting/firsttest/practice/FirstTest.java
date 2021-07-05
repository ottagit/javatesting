package com.javatesting.firsttest.practice;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FirstTest {
    @Test
    public void canAddTwoPlusTwo() {
        int sum = 2 + 2;
        assertEquals("2 + 2 yields 4", 4, sum);
    }

    @Test
    public void canDivideFourByTwo() {
        int div = 4 / 2;
        assertEquals("4/2=2", 2, div);
    }

    @Test
    public void canGetOctalEquivalent() {
        int oct64 = 0100;
        assertEquals("0100 is 64 in decimal", 64, oct64);
    }

    @Test
    public void bitwiseShiftOperatorExplored() {
        int x = 56;
        assertEquals("one left shift is double the decimal",
                x*2, x << 1);
        assertEquals("two left shifts is four times the decimal",
                x*4, x << 2);
        assertEquals("1 right shift is half the decimal",
                x/2, x >> 1);
        assertEquals("2 right shifts is a quarter the decimal",
                x/4, x >> 2);
        int y = Integer.MIN_VALUE; // -ve
        assertEquals((Integer.MAX_VALUE/2) + 1, y >>> 1);
    }
}
