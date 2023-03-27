package com.bytelegend;

public class Sheep extends Animal {
    private final String name;

    public Sheep(String name) {
        super(name);
    }

    public void meh() {
        System.out.print("meh, ");
        sayMyName();
    }
}
