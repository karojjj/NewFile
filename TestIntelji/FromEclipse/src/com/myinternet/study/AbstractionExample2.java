package com.myinternet.study;

public class AbstractionExample2 {
    public static void main(String[] args) {
        Pigg myPig = new Pigg(); // Create a Pig object
        myPig.animalSound();
        myPig.sleep();
    }
}

    // Abstract class
    abstract class Animale {
        // Abstract method (does not have a body)
        public abstract void animalSound();
        // Regular method
        public void sleep() {
            System.out.println("Zzz");
        }
    }

    // Subclass (inherit from Animal)
    class Pigg extends Animal {
        public void animalSound() {
            // The body of animalSound() is provided here
            System.out.println("The pig says: wee wee");
        }
    }

