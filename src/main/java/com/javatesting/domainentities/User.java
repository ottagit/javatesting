package com.javatesting.domainentities;

public class User {
    private String username;
    private String password;
    private int age;

    public User() {
        // call argument constructor from no-argument constructor
        this("username", "password");
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User(int age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername(){
        return username;
    }

    public int getAge() { return age; }

    public void setPassword(String password) {
        this.password = password;
    }
}
