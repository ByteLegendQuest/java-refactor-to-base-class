package com.bytelegend;

public class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }

    public void meow() {
        System.out.print("meow, ");
        sayMyName();
    }
}
