package com.javatesting.firsttest.practice;

import com.javatesting.domainentities.User;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class SetTest {
    @Test
    public void createUserSet(){
        User user1 = new User("username1", "password1");
        Set userSet = new HashSet();
        userSet.add(user1);
        userSet.add(user1);
        assertEquals("Set has 1 user", 1, userSet.size());
        User user2 = new User("username2", "password2");
        userSet.add(user2);
        assertEquals("Set has 2 users", 2, userSet.size());
    }
}
