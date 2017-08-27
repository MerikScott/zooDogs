package com.zoo;

public class Main {

    public static void main(String[] args) {

        Animal myAnimal = new Dog("pimpek");
        myAnimal.sayName();
        myAnimal.makeNoise();

        Animal myDachshund = new Dachshund("Longinus");
        myDachshund.makeNoise();
        myDachshund.sayName();
        myDachshund.getName();
        myDachshund.move();

        Dachshund myNewDauchshund = new Dachshund("Elongatus");
        myNewDauchshund.jump(); // jump nie dziala dla obiektow utworzonych przez klasę Animal

        Animal myAnimalTwo = new Dachshund("pompek");

        (Dachshund)myAnimalTwo.

    }
}
