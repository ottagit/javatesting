package com.javatesting.firsttest.practice;

import org.junit.Test;

import static org.junit.Assert.*;

public class SelectionTest {
    @Test
    public void pluralizeCat() {
        int numOfCats = 3;
        assertEquals("pluralize cat based on numOfCats",
                "Cats", catOrCats(numOfCats));
        numOfCats = 1;
        assertEquals("pluralize cat based on numOfCats",
                "Cat", catOrCats(numOfCats));
    }

    private String catOrCats(int numOfCats) {
        return numOfCats == 1 ? "Cat" : "Cats";
    }

    boolean truthy = true;

    @Test
    public void assertTrueIfTrue() {
        assertTrue(this.truthy);
    }

    @Test
    public void assertTrueAndFalse() {
        assertTrue(trueOrFalse(truthy));
        //assertFalse(trueOrFalse(!truthy));
    }

    private boolean trueOrFalse(boolean state) {
        return state;
    }

    @Test
    public void canCheckCountryCode() {
        String [] countriesEA = { "Kenya", "Uganda", "Tanzania" };
        assertEquals("should give correct country code",
                "KE", countryCode(countriesEA[0]));
    }

    private String countryCode(String country) {
        String shortCode;
        switch (country) {
            case "Kenya":
                shortCode = "KE";
                break;
            case "Uganda":
                shortCode = "UG";
                break;
            case "Tanzania":
                shortCode = "TZ";
                break;
            default:
                shortCode = "NA";
                break;
        }
        return shortCode;
    }

    @Test
    public void intInWords() {
        int num = (int) Math.floor(Math.random() * 10);
        assertEquals("1 is One", "One", numInWords(num));
    }

    private String numInWords(int num) {
        String numWord;
        //boolean compareToNum;
        switch (num) {
            case 1:
                numWord = "One";
                break;
            case 2:
                numWord = "Two";
                break;
            case 3:
                numWord = "Three";
                break;
            case 4:
                numWord = "Four";
                break;
            default:
                if (num > 4)
                    numWord = "Too big";
                else
                    numWord = "Too small";
        }
        return numWord;
    }
}
