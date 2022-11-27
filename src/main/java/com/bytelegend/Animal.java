package com.bytelegend;

public abstract class Animal {
    protected final String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void sayMyName();

    public void meow() {
        System.out.print("meow, ");
        sayMyName();
    }
}
