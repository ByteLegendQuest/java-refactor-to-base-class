package com.bytelegend;

public class Dog {
    private final String name;

    public Dog(String name) {
        this.name = name;
    }

    public void sayMyName() {
        System.out.println("my name is: " + name);
    }

    public void woof() {
        System.out.print("woof, ");
        sayMyName();
    }
}
