package com.javatesting.firsttest.practice;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayTest {
    @Test
    public void simpleArrayExample() {
        String[] vehicles = { "Mercedes", "Toyota", "Nissan", "Mazda" };

        for(String carMake: vehicles) {
            System.out.println(carMake);
        }
        assertEquals("Make 1 is mercedes", "Mercedes", vehicles[0]);
    }
}
