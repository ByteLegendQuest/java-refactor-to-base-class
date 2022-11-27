package com.bytelegend;

public class Dog extends Animal {


    public Dog(String name) {
        super(name);
    }

    public void sayMyName() {
        System.out.println("my name is: " + name);
    }

    public void woof() {
        System.out.print("woof, ");
        sayMyName();
    }
}
