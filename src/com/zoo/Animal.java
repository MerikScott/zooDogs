package com.zoo;

public abstract class Animal {


    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void sayName() {
        System.out.println("my name is: " + name);
    }

    public String getName() {
        return name;
    }

    public abstract void makeNoise();

    public abstract void move();

}
