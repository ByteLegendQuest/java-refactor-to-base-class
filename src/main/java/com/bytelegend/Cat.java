package com.bytelegend;

public class Cat {
    private final String name;

    public Cat(String name) {
        super(name);
    }

    public void meow() {
        System.out.print("meow, ");
        sayMyName();
    }
}
