package com.syntax.mypractice;

abstract class Dog{
    String breed;
    public void bark(){
        System.out.println("bark");
    }
    public abstract void poop();
}
class Husky extends Dog{
//implementing oublic void poop method
    @Override
    public void poop() {
        System.out.println("dog is pooped");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        Husky dog=new Husky();
        dog.bark();
        dog.poop();
    }
}
