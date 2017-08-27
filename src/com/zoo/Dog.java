package com.zoo;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println("hau hau");
    }

    @Override
    public void move() {
        System.out.println("jumping like a dog...");
    }

    @Override
    public void sayName() {
        //super.sayName();
        System.out.println("I'm a dog, my name is: " + getName());
    }

    public void jump() {
        System.out.println("I'm jumping");
    }
}
