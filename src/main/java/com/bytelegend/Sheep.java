package com.bytelegend;

public class Sheep extends Animal{
//    private final String name;

    public Sheep(String name) {
//        this.name = name;
        super(name);
    }

//    public void sayMyName() {
//        System.out.println("my name is: " + name);
//    }

    public void meh() {
        System.out.print("meh, ");
        sayMyName();
    }
}
