package com.javatesting.domainentities;

public class User {
    private String username;
    private String password;

    public User() {
        // call argument constructor from no-argument constructor
        this("username", "password");
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername(){
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
