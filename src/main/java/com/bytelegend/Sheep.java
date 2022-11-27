package com.bytelegend;

public class Sheep extends Animal {


    public Sheep(String name) {
        super(name);
    }

    public void sayMyName() {
        System.out.println("my name is: " + name);
    }

    public void meh() {
        System.out.print("meh, ");
        sayMyName();
    }
}
