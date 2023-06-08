package com.bytelegend;

public class Sheep extends Animal {

    public Sheep(String name) {
        this.name = name;
    }

    public void meh() {
        System.out.print("meh, ");
        sayMyName();
    }
}
