package com.myinternet.study;

public class AbstractionExample {
    public static void main(String[] args) {
        Pig myPig=new Pig();
        myPig.animalSound();
        myPig.sleep();
    }
}
//Abstract class: is a restricted class that cannot be used to create objects
// (to access it, it must be inherited from another class).Abstract method:
// can only be used in an abstract class, and it does not have a body.
// The body is provided by the subclass (inherited from).
//An abstract class can have both abstract and regular methods:
abstract class Animal{ //abstract class
    public abstract void animalSound(); //abstract method cannot have body
    public void sleep(){ //regular method
        System.out.println("zzzzzzzzzzzzz");
    }
}
class Pig extends Animal {
    @Override
    public void animalSound() { //the body of animalSound is provided here
        System.out.println("the pig says we weee");
    }
}