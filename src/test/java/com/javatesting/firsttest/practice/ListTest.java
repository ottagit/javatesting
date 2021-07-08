package com.javatesting.firsttest.practice;

import com.javatesting.domainentities.User;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ListTest {
    @Test
    public void getAnElementAtAnIndex(){
        List<String> countries = new ArrayList<>();

        countries.add("Kenya");
        countries.add("Denmark");
        countries.add("Zambia");

        assertEquals("Denmark", countries.get(1));
    }
    @Test
    public void removeElementAtAnIndex() {
        List<Integer> ages = new ArrayList<>();

        ages.add(25);
        ages.add(27);
        ages.add(17);

        assertFalse("Third user object is underage", isAdult(ages.get(2)));
        User user = new User(30);
        assertTrue("User is of legal age", isAdult(user.getAge()));
        ages.add(user.getAge());
        assertEquals("List of ages is 4", 4, ages.size());
        User user2 = new User(16);
        ages.add(user2.getAge());
        assertEquals("List of ages is 5", 5, ages.size());
        assertTrue("List includes user 2 age", ages.contains(16));
        // Remove underage from list
        assertTrue("Remove age 16 from list", removeMinor(ages, user2.getAge()));
        assertEquals("List of ages is 4", 4, ages.size());
        // Retain adult ages
        assertFalse("Retain age 30 in list", removeMinor(ages, user.getAge()));
        // Set first age to 12
        ages.set(0, 12);
        assertTrue("Remove age 12 from list", removeMinor(ages, ages.get(0)));
        assertFalse("List of ages includes 12", ages.contains(12));
    }
    private boolean isAdult(int age){
        return age >= 18;
    }
    private boolean removeMinor(List<Integer> collection, int age){
        if (!isAdult(age)){
            collection.remove(collection.indexOf(age));
            return true;
        }
        return false;
    }
    @Test
    public void addElementsToCollection(){
        List<String> days = new ArrayList<>();
        List<String> mid_days = new ArrayList<>();
        days.add("Monday");
        days.add("Friday");
        // Add mid days
        mid_days.add("Tuesday");
        mid_days.add("Wednesday");
        mid_days.add("Thursday");
        // Insert mid days into days
        days.addAll(1, mid_days);
        assertEquals("Second weekday is Tuesday", "Tuesday", days.get(1));
        // Create weekend list
        List<String>weekendDays = new ArrayList<>();
        weekendDays.add("Saturday");
        weekendDays.add("Sunday");
        // Add collection at beginning of days
        days.add(0, weekendDays.get(1));
        assertEquals("First day of week is Sunday","Sunday", days.get(0));
        days.add(weekendDays.get(0));
        assertEquals("First day of week is Saturday","Saturday", days.get(6));
        // Extract workdays
        List<String> workdays = new ArrayList<>();
        workdays = days.subList(1,6);
        assertTrue("Monday is first working day", workdays.get(0).equals("Monday"));
    }
}