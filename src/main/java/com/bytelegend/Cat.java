package com.bytelegend;

public class Cat {
    private final String name;

    public Cat(String name) {
        this.name = name;
    }

    public void sayMyName() {
        System.out.println("my name is: " + name);
    }

    public void meow() {
        System.out.print("meow, ");
        sayMyName();
    }
}
