package com.syntax.mypractice;

public class SuperKeyword {
    public static void main(String[] args) {
        Animal animal=new Dog1(); //creating an 0bject of the DOG1 class
        animal.animalSound(); //calling the method on the dog object
    }
}
class Animal { //superclass {parent class}
    public void animalSound() {
        System.out.println("the animal makes sound");
    }
}
class Dog1 extends Animal{ //subclass=child class
    public void animalSound(){
        super.animalSound(); // we can call the superclass method
        System.out.println("the dog says :bow bow");
    }

}

