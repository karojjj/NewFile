package com.myinternet.Interface;

public interface Example1 {
    public static void main(String[] args) {
        Pig myPigo=new Pig(); //creating a pig object
        myPigo.animalSound();
        myPigo.sleep();
    }
}
interface Animal{
    public void animalSound();  // interface method (does not have a body)
    public void sleep();  // interface method (does not have a body)
}
class Pig implements Animal{ //// Pig "implements" the Animal interface

    @Override
    public void animalSound() { // // The body of animalSound() is provided here
        System.out.println("wee wee");
    }

    @Override
    public void sleep() {  // The body of animalSound() is provided here
        System.out.println("Zzzzz");
    }
}