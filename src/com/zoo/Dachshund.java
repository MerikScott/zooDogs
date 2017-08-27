package com.zoo;

public class Dachshund extends Dog {

    public Dachshund(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("I'm Dachshund, uoua uoa");
    }

    @Override
    public void move() {
        super.move();
        System.out.println("I'm Dachshund, I move close to the ground");
    }

    @Override
    public void sayName() {
        super.sayName();
        System.out.println("I'm Dachshund, my name is " + getName());
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
