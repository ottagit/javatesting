package com.javatesting.domainentities.practice;

import com.javatesting.domainentities.User;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserTest {
    @Test
    public void canConstructANewUser() {
        User user = new User();

        assertEquals("default username expected",
                "username", user.getUsername());
        assertEquals("default password expected",
                "password", user.getPassword());
    }

    @Test
    public void canConstructWithUsernameAndPassword() {
        User user = new User("admin", "pass123_");

        assertEquals("given username expected",
                "admin", user.getUsername());
        assertEquals("given password expected",
                "pass123_", user.getPassword());
    }

    @Test
    public void canSetPasswordAfterConstructed() {
        User user = new User();
        user.setPassword("newpassword");
        assertEquals("setter password expected",
                "newpassword", user.getPassword());
    }
}
