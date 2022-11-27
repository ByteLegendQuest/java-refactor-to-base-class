package com.bytelegend;

public class Animal {
    protected final String name;

    public Animal(String name) {
        this.name = name;
    }

    public void sayMyName(
        System.out.println("my name is: " + name);
    );

    public void meow() {
        System.out.print("meow, ");
        sayMyName();
    }
}
