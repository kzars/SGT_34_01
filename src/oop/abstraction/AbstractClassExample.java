package oop.abstraction;

abstract class Animal{
    protected String name;
    public void sleep(){
        System.out.println("zzzzz");
    }
    public abstract void animalSound();
}

class Pig extends Animal{
    public void animalSound(){
        System.out.println("oink, oink");
    }
}

public class AbstractClassExample {
    public static void main(String[] args) {
        //Connot create and abject of abstract class
        //Animal animal1 = new Animal();

        Pig pig = new Pig();
        pig.sleep();
        pig.animalSound();

    }
}
