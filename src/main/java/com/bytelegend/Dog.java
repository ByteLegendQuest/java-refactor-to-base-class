package com.bytelegend;

public class Dog {
    private final String name;

    public Dog(String name) {
        super(name);
    }

    public void woof() {
        System.out.print("woof, ");
        sayMyName();
    }
}
