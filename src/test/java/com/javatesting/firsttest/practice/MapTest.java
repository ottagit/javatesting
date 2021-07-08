package com.javatesting.firsttest.practice;

import com.javatesting.domainentities.User;
import org.junit.Test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

public class MapTest {
    @Test
    public void mapOfUsers(){
        Map<String, User> userMap = new HashMap<>();
        User user1 = new User("user1", "password1");
        User user2 = new User("user2", "password2");
        // Add user objects to user map
        userMap.put("key1", user1);
        assertEquals("User 1 password should match", "password1", user1.getPassword());
        userMap.put("key2", user2);
        assertEquals("User 2 password should match", "password2", user2.getPassword());
        assertEquals("Map of 2 users", 2, userMap.size());
        User user3 = new User("user3", "password3");
        // Add third user object to user map using the same key
        userMap.put("key2", user3);
        assertEquals("Map of 2 users", 2, userMap.size());
        assertEquals("Should return user 3", user3, userMap.get("key2"));
        // Remove user
        userMap.remove("key2");
        assertFalse("Key 2 missing", userMap.containsKey("key2"));
        assertTrue("Key 1 still present", userMap.containsKey("key1"));
        assertEquals(1, userMap.size());
        // Create new map of users
        Map<String, User> userMap1= new HashMap<>();
        User chris = new User("melanin", "chris123");
        User bil = new User("cutie", "bil123");
        userMap1.put("key1", chris);
        userMap1.put("key2", bil);
        userMap.putAll(userMap1);
        assertEquals(2, userMap.size());
        // Return collection of values in user map
        Collection<User> values = userMap.values();
        User[] users = new User[values.size()];
        values.toArray(users);
        assertEquals(bil, users[1]);
        assertEquals(2, users.length);
        // Return a set of keys from user map
        Set<String> userKeys = userMap.keySet();
        String[] userKeyArr = new String[userKeys.size()];
        userKeys.toArray(userKeyArr);
        assertEquals("key2", userKeyArr[1]);
        // Use entrySet to return the set of entry objects
        Set<Map.Entry<String, User>> userEntries = userMap.entrySet();
        for(Map.Entry<String, User> userEntry: userEntries) {
            userEntry.setValue(bil);
            System.out.println(userEntry.getKey());
            System.out.println(userEntry.getValue());
        }
        assertEquals(bil, userMap.get("key2"));
        System.out.println(userMap);
    }
}
