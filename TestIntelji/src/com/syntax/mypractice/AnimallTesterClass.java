package com.syntax.mypractice;

public class AnimallTesterClass { //many forms or many shapes thats mean our class do the same things with the different way

    public static void main(String[] args) {
        Animall myAnimal=new Animall();
        myAnimal.eat();
        System.out.println("________________________");
        Dogg dogg=new Dogg();
        dogg.eat();
        System.out.println("________________________");
        Catt catt=new Catt();
        catt.eat();
        //so we have eat() method for Animal, dog and cat classes , this method has diffrent behaviours in each class but
        // method name is the same but it has different behaviours this is polymorphism briefly the same method has
        // different forms

    }
}
