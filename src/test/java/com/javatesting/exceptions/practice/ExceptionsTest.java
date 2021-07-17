package com.javatesting.exceptions.practice;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExceptionsTest {
    @Test
    public void throwNullPointerException(){
        Integer age  = null;

        String ageAsString = "";
        String myAge = "";

        try {
           ageAsString = age.toString();
        }
        catch (NullPointerException e) {
            age = 27;
            ageAsString = age.toString();
            System.out.println("Exception error message: " + e.getMessage());
            System.out.println("StackTraceElement object: " + e.getStackTrace());
            System.out.println("Stack trace: ");
            e.printStackTrace();
            // throw new IllegalArgumentException("Null pointer became illegal");
        }
        /*catch (IllegalArgumentException e) {
            System.out.println("Illegal argument " + e.getMessage());
        }*/
        finally {
         myAge = "I am " + ageAsString + " years old";
         System.out.println(myAge);
        }
        assertEquals("I am 27 years old", myAge);
    }
    // Check for thrown exception
    @Test(expected = ArithmeticException.class)
    public void divisionByZeroExpected(){
        int num = 12;
        int div = num / 0;
        System.out.println(div);
    }
}
