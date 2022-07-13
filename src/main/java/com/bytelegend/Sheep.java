package com.bytelegend;

public class Sheep {
    private final String name;

    public Sheep(String name) {
        this.name = name;
    }

    public void sayMyName() {
        System.out.println("my name is: " + name);
    }

    public void meh() {
        System.out.print("meh, ");
        sayMyName();
    }
}
