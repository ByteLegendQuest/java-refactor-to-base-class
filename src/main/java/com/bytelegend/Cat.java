package com.bytelegend;

public class Cat extends Animal {

    public Cat(String name) {
        this.name = name;
    }

    public void meow() {
        System.out.print("meow, ");
        sayMyName();
    }
}
