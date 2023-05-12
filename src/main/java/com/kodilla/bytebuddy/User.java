package com.kodilla.bytebuddy;

import java.util.Random;

public class User {
    private String name;
    private final Random random = new Random();
    public User() {
        this.name = UserNameGenerator.generateRandomName();
    }

    public String getName() {
        return name;
    }

    public void doSomething() {
        System.out.println(name + " is doing something...");
    }
}
