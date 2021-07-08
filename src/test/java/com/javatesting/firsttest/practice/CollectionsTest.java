package com.javatesting.firsttest.practice;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.*;

public class CollectionsTest {
    @Test
    public void dynamicCollection() {
        // List is an interface which declares the type of collection in use
        // ArrayList is the specific implementation of List in use
        // Elements in a List are added in order
        List<String> numbers0123 = new ArrayList<>();

        numbers0123.add("Zero");
        numbers0123.add("One");
        numbers0123.add("Two");
        numbers0123.add("Three");

        assertEquals("First list item is zero", "Zero", numbers0123.get(0));

        String[] days = { "Friday", "Monday", "Thursday", "Wednesday", "Saturday", "Tuesday" };
        List<String> list_of_days = Arrays.asList(days);
        // Use a for each loop to find position of Wednesday
        int forEachCount = 0;
        for(String day : list_of_days) {
            if(day.equals("Wednesday")){
                break;
            }
            forEachCount++;
        }
        assertEquals("Wednesday is at position 3", 3, forEachCount);
        // Use a for loop to find the position of Tuesday
        int forCount;
        for(forCount = 0; forCount < list_of_days.size(); forCount++) {
            if(list_of_days.get(forCount).equals("Tuesday")){
                break;
            }
        }
        assertEquals("Tuesday is at position 3", 5, forCount);
        // Use a while loop to find the position of Thursday
        int whileCount = 0;
        while(!(list_of_days.get(whileCount).equals("Thursday"))){
            whileCount++;
        }
        assertEquals("Thursday is at position 2", 2, whileCount);
        // Use a do...while loop to find the position of Saturday
        int doCount = 0;
        do {
            doCount++;
        } while (!(list_of_days.get(doCount).equals("Saturday")));
        assertEquals("Saturday is at position 4", 4, doCount);
    }

    @Test
    public void moreCollections() {
        Collection<String> weekdays = new ArrayList<>();
        Collection<String> weekend_days = new ArrayList<>();
        Collection<String> daysOfWeek = new ArrayList<>();

        weekdays.add("Monday");
        weekdays.add("Tuesday");
        weekdays.add("Wednesday");
        weekdays.add("Thursday");
        weekdays.add("Friday");

        assertEquals("Number of weekdays is 5", 5, weekdays.size());

        weekend_days.add("Saturday");
        weekend_days.add("Sunday");
        daysOfWeek.addAll(weekdays);
        daysOfWeek.addAll(weekend_days);
        assertEquals("7 days in a week", 7, daysOfWeek.size());
        assertTrue("Weekend days are part of the week", daysOfWeek.containsAll(weekend_days));
        // Remove object from a collection
        daysOfWeek.remove("Sunday");
        assertFalse("Exclude Sunday", daysOfWeek.contains("Sunday"));
        // Empty a collection
        daysOfWeek.clear();
        assertEquals("No day of week available", 0, 0);
        assertTrue("All days removed", daysOfWeek.isEmpty());
        // Add weekdays and weekend days collections
        daysOfWeek.addAll(weekdays);
        assertTrue("Weekdays part of days of week", daysOfWeek.containsAll(weekdays));
        daysOfWeek.addAll(weekend_days);
        assertEquals("7 days in a week", 7, daysOfWeek.size());
        // Remove weekend days
        daysOfWeek.removeAll(weekend_days);
        //assertEquals("No weekends included", 5, daysOfWeek.size());
        assertFalse("Weekend excluded", daysOfWeek.containsAll(weekend_days));
        // Remove all but one collection from another
        daysOfWeek.addAll(weekend_days);
        daysOfWeek.retainAll(weekend_days);
        assertEquals("2 weekend days left", 2, daysOfWeek.size());
        assertTrue("Only weekends left", daysOfWeek.containsAll(weekend_days));
        assertFalse("No weekdays included", daysOfWeek.containsAll(weekdays));
        // Convert collection to an array
        Object[] weekdaysArray = weekdays.toArray();
        assertEquals("Array length matches collection size", 5, weekdaysArray.length);
        String[] anotherArray = new String[daysOfWeek.size()];
        daysOfWeek.toArray(anotherArray);
        assertEquals("Sunday".length(), anotherArray[1].length());
    }

}
