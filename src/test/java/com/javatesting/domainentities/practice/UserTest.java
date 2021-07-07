package com.javatesting.domainentities.practice;

import com.javatesting.domainentities.User;
import org.junit.Test;

import java.util.Arrays;

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
    @Test
    public void createArrayOfUsers() {
        User[] users = new User[3];

        users[0] = new User("bob", "bobpass");
        users[1] = new User("lenox", "lenoxpass");
        users[2] = new User("richard", "richiepassword");

        assertEquals("bob", users[0].getUsername());
        assertEquals("richiepassword", users[2].getPassword());

        for (User user : users) {
            System.out.println(user.getUsername());
        }
        User[] people;
        people = Arrays.copyOf(users, 5);
        assertEquals("unassigned values set to default",
                null, people[3]);
        // Copy range in array
        User[] clones = Arrays.copyOfRange(users, 1, 3);
        assertEquals("clone of second user", clones[0], users[1]);
        // Use an end item count > array length to increase size of array
        String[] workdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        String[] mid_days = Arrays.copyOfRange(workdays, 2, 7);
        assertEquals("Saturday is not a work day", null, mid_days[3]);
        assertEquals("Sunday is not a work day", null, mid_days[4]);
        // Fill range with specific values
        Arrays.fill(mid_days, 3, 5, "Weekend");
        assertEquals("set Saturday to weekend", "Weekend", mid_days[3]);
        assertEquals("set Sunday to weekend", "Weekend", mid_days[4]);
        // Sort days
        Arrays.sort(workdays);
        assertEquals("Friday is sorted first", "Friday", workdays[0]);
        assertEquals("Wednesday is sorted first", "Wednesday", workdays[4]);
        // Create a 3d array
        int[][][] threeD = new int[3][4][5];
        assertEquals("length of outer array is 3", 3, threeD.length);
        assertEquals("length of inner array is 4", 4, threeD[0].length);
        assertEquals("length of most inner array is 5", 5, threeD[0][0].length);
        // Create ragged arrays
        int[][] ragged_2d = new int[4][];
        ragged_2d[0] = new int[3];
        ragged_2d[3] = new int[2];
        assertEquals("first inner array is of size 3", 3, ragged_2d[0].length);
        assertEquals("first inner array is of size 2", 2, ragged_2d[3].length);
        assertEquals("default value is zero", 0, ragged_2d[0][0]);
    }
}
