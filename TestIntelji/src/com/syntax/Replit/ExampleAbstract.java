package com.syntax.Replit;

abstract class Animal{ //abtract class can have body
    public abstract void animalSound(); //abstract void can not have body{}

public void sleep(){ // regular method
    System.out.println("zzzzzzzzzzzzz");
}}
class Pig extends Animal{     //subclass inherited from animal class

    //Class 'Pig' must either be declared abstract or implement abstract method 'animalSound()' in 'Animal'
    @Override
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
}
public class ExampleAbstract {
    public static void main(String[] args) {
        Pig myPigg=new Pig(); //// Create a Pig object
        myPigg.animalSound();
        myPigg.sleep();
    }
}
