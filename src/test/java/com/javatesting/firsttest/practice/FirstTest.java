package com.javatesting.firsttest.practice;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FirstTest {
    @Test
    public void canAddTwoPlusTwo() {
        int product = 2 * 3;
        assertEquals("2*3=6", 6, product);
    }

    @Test
    public void canDivideFourByTwo() {
        int div = 4 / 2;
        assertEquals("4/2=2", 2, div);
    }
}
