package com.bytelegend;

public class Dog extends Animal {
    private final String name;

    public Dog(String name) {
        super(name);
    }

    public void woof() {
        System.out.print("woof, ");
        sayMyName();
    }
}
